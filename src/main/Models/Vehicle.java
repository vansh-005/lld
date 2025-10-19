package main.Models;

import main.enums.VehicleType;

public abstract class Vehicle {
    private final VehicleType type;
    private final String number;
    public Vehicle(VehicleType type, String number) {
        this.type = type;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public VehicleType getType() {
        return type;
    }
}

