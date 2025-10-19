package main.Models;

import main.enums.VehicleType;

public class Bus extends Vehicle {
    public Bus (String number){
        super(VehicleType.BUS, number);
    }
}
 