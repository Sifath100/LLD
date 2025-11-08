package ParkingLot;

import ParkingLot.Controller.EntryGate;
import ParkingLot.Controller.ExitGate;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.Vehicle;
import ParkingLot.Model.VehicleType;
import ParkingLot.Service.ParkingSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle(1, VehicleType.FOUR_WHEELER);
        ParkingSystem parkingSystem=new ParkingSystem();
        EntryGate entryGate=new EntryGate(parkingSystem);
        ExitGate exitGate=new ExitGate(parkingSystem);
        ParkingFloor parkingFloor=new ParkingFloor(3,3);
        entryGate.vehicleEntry(vehicle1,parkingFloor,1);
//        System.out.println(parkingFlod);
        exitGate.exitVehicle(vehicle1,parkingFloor,5);
    }
}
