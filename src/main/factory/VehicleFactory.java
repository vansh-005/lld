package main.factory;

//package main.Models;

import main.Models.Bike;
import main.Models.Bus;
import main.Models.Car;
import main.Models.Vehicle;
import main.enums.VehicleType;

public class VehicleFactory {
    public static Vehicle createVehicle(String id, VehicleType type){
        switch (type){
            case CAR:
                return new Car(id);
            case BUS:
                return new Bus(id);
            case BIKE:
                return new Bike(id);
            default:
                throw new IllegalArgumentException("Invalid Vehicle type");
        }
    }
}

