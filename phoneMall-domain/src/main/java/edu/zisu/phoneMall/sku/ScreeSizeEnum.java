package edu.zisu.phoneMall.sku;

public enum ScreeSizeEnum {

    BIG("5.5-5.1英寸", 1), BIGGEST("5.6英寸及以上", 2), BIGGER("5.0-4.6英寸", 3), MIN("3.0英寸及以下", 4),MEDIUM("4.5-3.1英寸",5);

    private String fieldName;
    private Integer fieldVal;

    ScreeSizeEnum(String fieldName, Integer fieldVal) {
        this.fieldName = fieldName;
        this.fieldVal = fieldVal;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getFieldVal() {
        return fieldVal;
    }

    public void setFieldVal(Integer fieldVal) {
        this.fieldVal = fieldVal;
    }
}
