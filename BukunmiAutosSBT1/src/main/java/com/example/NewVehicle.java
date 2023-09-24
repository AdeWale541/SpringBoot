package com.example;

public class NewVehicle {
    private String brandName="";
    private int carId;
    private String carColour="";
    private Boolean hasAutoBreaking;
    private int numberOfDoors=0;
    private String gearType;
    private int numberOfWheels=0;
    private int engineCapacity=0;
    private int selfDrivingMaxSpeed=0;
    private int maximumSpeed=0;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public Boolean getHasAutoBreaking() {
        return hasAutoBreaking;
    }

    public void setHasAutoBreaking(Boolean hasAutoBreaking) {
        this.hasAutoBreaking = hasAutoBreaking;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getSelfDrivingMaxSpeed() {
        return selfDrivingMaxSpeed;
    }

    public void setSelfDrivingMaxSpeed(int selfDrivingMaxSpeed) {
        this.selfDrivingMaxSpeed = selfDrivingMaxSpeed;
    }



    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
}
