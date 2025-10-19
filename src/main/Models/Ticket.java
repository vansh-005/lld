package main.Models;

import main.enums.PaymentStatus;
import main.enums.VehicleType;

import java.time.LocalDateTime;

public class Ticket {
    private String id;
    private LocalDateTime entryTime;
    private VehicleType vehicleType;
    private String floorId;
    private String SpotId;
    private PaymentStatus paymentStatus = PaymentStatus.Pending;
}
