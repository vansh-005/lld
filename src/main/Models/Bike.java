package main.Models;

import main.enums.VehicleType;

public class Bike extends Vehicle {
    public Bike (String number){
        super(VehicleType.BIKE,number);
    }
}

