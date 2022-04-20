package com.example.Car_App;

public class Information {
    String name;
    String carname;
    String contactno;
    String modelno;

    public Information(String name, String carname, String contactno, String modelno) {
        this.name = name;
        this.carname = carname;
        this.contactno = contactno;
        this.modelno = modelno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }
}
