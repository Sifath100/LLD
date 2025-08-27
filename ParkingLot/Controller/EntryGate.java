package ParkingLot.Controller;

import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.Vehicle;
import ParkingLot.Service.ParkingSystem;

public class EntryGate {
    ParkingSystem parkingSystem;
    public EntryGate(ParkingSystem parkingSystem){
        this.parkingSystem=parkingSystem;
    }
    public void vehicleEntry(Vehicle vehicle, ParkingFloor parkingFloor,int hour){
        if(parkingFloor.validateParkingFloor()){
           System.out.println("Sorry capacity is full");
           return;
        }
        Ticket ticket=new Ticket(vehicle,parkingFloor,hour);
        parkingFloor.occupySpot(vehicle);
        parkingSystem.addVehicle(vehicle,ticket);
    }

}
