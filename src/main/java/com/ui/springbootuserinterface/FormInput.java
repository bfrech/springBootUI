package com.ui.springbootuserinterface;

import java.util.Date;

public class FormInput {

    private long id;
    private String plantId;
    private String startDate;
    private String endDate;
    private String productionID;
    private String userDataName;
    private String userData;

    public void setId(long id) {
        this.id = id;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setProductionID(String productionID) {
        this.productionID = productionID;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public void setUserDataName(String userDataName) {
        this.userDataName = userDataName;
    }

    public String getPlantId(){
        return plantId;
    }

    public String getStartDate(){
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getProductionID() {
        return productionID;
    }

    public String getUserData() {
        return userData;
    }

    public String getUserDataName() {
        return userDataName;
    }
}
