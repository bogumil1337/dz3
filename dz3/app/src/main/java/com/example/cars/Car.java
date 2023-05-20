package com.example.cars;

import java.util.Date;

public class Car {
    private String name;
    private String date;
    private String carDescription;
    private int carResource;

    public Car(String name, String date,String carDescription, int carResource ) {
        this.name = name;
        this.date = date;
        this.carDescription = carDescription;
        this.carResource = carResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public int getCarResource() {
        return carResource;
    }

    public void setCarResource(int carResource) {
        this.carResource = carResource;
    }
}
