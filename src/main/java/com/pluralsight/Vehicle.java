package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - this.year;

        if (age <= 3) {
            value -= value * (age * .03);
        } else if (age <= 6){
            value -= value * (age * .06);
        } else if (age <= 10){
            value -= value * (age * .08);
        } else {
            value = 1000;
        }


        boolean highMileage = this.odometer > 100000;
        boolean isHonda = this.makeModel.toLowerCase().contains("honda");
        boolean isToyota = this.makeModel.toLowerCase().contains("toyota");

        boolean isReliableBrand = isHonda || isToyota;

        if (highMileage && !isReliableBrand) {
            value -= value * .25;
        }
        return value;
    }
}
