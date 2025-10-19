package main.Models;

import main.enums.VehicleType;

import java.util.HashMap;
import java.util.Map;

// should i use a concurrent map here?

public class ParkingFloor {
    private final String id;
    private final Map<String, ParkingSpot> spots = new HashMap();
    public void addSpot(ParkingSpot spot) {
        spots.put(spot.getId(),spot);
    }
    public ParkingSpot findAvailableSpot(VehicleType type) {
        for(ParkingSpot spot : spots.values()){
            if(spot.tryOccupy(type)) return spot;
        }
        return null;
    }
}
