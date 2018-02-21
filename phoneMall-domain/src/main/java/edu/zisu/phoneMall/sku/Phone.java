package edu.zisu.phoneMall.sku;

import java.sql.Date;
import java.sql.Timestamp;

public class Phone {
    private Long id;
    private String phoneName;
    private String phoneBrand;
    private Integer phonePrice;
    private Integer phoneStock;
    private String phonePic;
    private String phoneConfig;
    private String creator;
    private Date created;
    private String operator;
    private Date modified;
    private Integer status;

    public Phone(Long skuId,String phoneName, String phoneBrand, Integer phonePrice, Integer phoneStock, String phonePic,
                 String phoneConfig,String creator, String operator) {
        this.id = skuId;
        this.phoneName = phoneName;
        this.phoneBrand = phoneBrand;
        this.phonePrice = phonePrice;
        this.phoneStock = phoneStock;
        this.phonePic = phonePic;
        this.phoneConfig = phoneConfig;
        this.creator = creator;
        this.operator = operator;
    }

    public Phone(Long id, String phoneName, String phoneBrand, Integer phonePrice, Integer phoneStock, String phonePic,
                 String phoneConfig, String creator, Timestamp created, String operator, Timestamp modified, Integer status) {
        this.id = id;
        this.phoneName = phoneName;
        this.phoneBrand = phoneBrand;
        this.phonePrice = phonePrice;
        this.phoneStock = phoneStock;
        this.phonePic = phonePic;
        this.phoneConfig = phoneConfig;
        this.creator = creator;
        this.created = Date.valueOf(created.toLocalDateTime().toLocalDate());
        this.operator = operator;
        this.modified = Date.valueOf(modified.toLocalDateTime().toLocalDate());
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Integer phonePrice) {
        this.phonePrice = phonePrice;
    }

    public Integer getPhoneStock() {
        return phoneStock;
    }

    public void setPhoneStock(Integer phoneStock) {
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
