package edu.zisu.phoneMall.sku;

public class Phone {
    private String phoneName;
    private String phoneBrand;
    private String phonePrice;
    private String phoneStock;
    private String phonePic;
    private String phoneConfig;
    private String creator;
    private String operator;

    public Phone(String phoneName, String phoneBrand, String phonePrice, String phoneStock, String phonePic,
                 String phoneConfig,String creator, String operator) {
        this.phoneName = phoneName;
        this.phoneBrand = phoneBrand;
        this.phonePrice = phonePrice;
        this.phoneStock = phoneStock;
        this.phonePic = phonePic;
        this.phoneConfig = phoneConfig;
        this.creator = creator;
        this.operator = operator;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(String phonePrice) {
        this.phonePrice = phonePrice;
    }

    public String getPhoneStock() {
        return phoneStock;
    }

    public void setPhoneStock(String phoneStock) {
        this.phoneStock = phoneStock;
    }

    public String getPhonePic() {
        return phonePic;
    }

    public void setPhonePic(String phonePic) {
        this.phonePic = phonePic;
    }

    public String getPhoneConfig() {
        return phoneConfig;
    }

    public void setPhoneConfig(String phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
