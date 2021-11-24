package com.ui.springbootuserinterface;


public class Result {
    private String date;
    private String dataName;
    private String data;


    public String getData() {
        return data;
    }

    public String getDate() {
        return date;
    }

    public String getDataName() {
        return dataName;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
