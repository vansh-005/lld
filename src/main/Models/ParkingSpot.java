package main.Models;

// Unique id

import main.enums.VehicleType;

import java.util.concurrent.atomic.AtomicBoolean;

public class ParkingSpot {
    private final String id;
    private final VehicleType allowedType;
    private AtomicBoolean occupied = new AtomicBoolean(false);
    public boolean tryOccupy(VehicleType type){
        if(type != allowedType) return false;
        return occupied.compareAndSet(false, true);
    }
    public void vacate(){
        occupied.set(false);
    }
    public boolean isOccupied(){
        return occupied.get();
    }
    public String getId() {
        return id;
    }
}
