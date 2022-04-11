package com.example.demo;

public class Employee {

    private int id;
    private String carmark;
    private String carmodel;
    private String enginevolume;
    private String drive;
    private String year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarmark() {
        return carmark;
    }

    public void setCarmark(String carmark) {
        this.carmark = carmark;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getEnginevolume() {
        return enginevolume;
    }

    public void setEnginevolume(String enginevolume) {
        this.enginevolume = enginevolume;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id +
                ", carmark='" + carmark + '\'' +
                ", carmodel='" + carmodel + '\'' +
                ", enginevolume='" + enginevolume + '\'' +
                ", drive='" + drive + '\'' +
                ", year='" + year + '\'' + '}';
    }
}
