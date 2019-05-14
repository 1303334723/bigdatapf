package com.behavioranalysis.pojo;

public class AreaTop3Product {
    private Integer taskId;

    private String area;

    private String areaLevel;

    private Integer productId;

    private String cityInfos;

    private Integer clickCount;

    private String productName;

    private String productStatus;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel == null ? null : areaLevel.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getCityInfos() {
        return cityInfos;
    }

    public void setCityInfos(String cityInfos) {
        this.cityInfos = cityInfos == null ? null : cityInfos.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }
}