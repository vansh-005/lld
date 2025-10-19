package main.Services;


import java.util.Map;
import java.util.HashMap;
import main.Models.ParkingFloor;
import main.Models.Ticket;
import main.Models.Vehicle;
import main.enums.VehicleType;

public class ParkingLot {
    private static ParkingLot instance ;
    private final Map<String, ParkingFloor> parkingFloors = new HashMap<String,ParkingFloor>();
    private final Map<String, Ticket> activeTickets = new HashMap<String,Ticket>();

    private static ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }
    public void addFloor(){}
    public Ticket parkVehicle(Vehicle vehicle){}
    public void unParkVehicle(Vehicle vehicle){}
    public void printStatus(){}
}
