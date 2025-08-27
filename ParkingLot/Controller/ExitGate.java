package ParkingLot.Controller;

import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.Vehicle;
import ParkingLot.Service.ParkingSystem;

public class ExitGate {
    ParkingSystem parkingSystem;
    public ExitGate(ParkingSystem parkingSystem){
        this.parkingSystem=parkingSystem;
    }
    public void exitVehicle(Vehicle vehicle, ParkingFloor parkingFloor,int hour){
        System.out.println(parkingSystem.calculateCost(vehicle,hour));
        parkingSystem.removeVehicle(vehicle);
        parkingFloor.vacateSpot(vehicle);
    }
}
