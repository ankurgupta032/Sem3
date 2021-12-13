package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getOwnerName() {
        return null;
    }
    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Accessing the radio");
    }

}
