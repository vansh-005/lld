package main.Models;

import main.enums.VehicleType;

public class Car extends Vehicle {
    public Car(String number){
        super(VehicleType.CAR,number);
    }
}
