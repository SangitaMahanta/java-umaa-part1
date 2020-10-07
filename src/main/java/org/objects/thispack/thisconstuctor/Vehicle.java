package org.objects.thispack.thisconstuctor;

public class Vehicle {
    private String registrationState;
    private String color;
    private String vehicleId;
    private String vehicleType;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationState() {
        return registrationState;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRegistrationState(String registrationState) {
        if (registrationState == null) {
            this.registrationState = "DL";
        }
        else
            {
            this.registrationState = registrationState;
        }
    }

    Vehicle(VehicleMain t){
        this.setRegistrationState("Odisha");
        this.setColor("Black");
    }
}
