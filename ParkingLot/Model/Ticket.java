package ParkingLot.Model;

public class Ticket {
    public int hour;
    Vehicle vehicle;
    ParkingFloor parkingFloor;


    public Ticket(Vehicle vehicle, ParkingFloor parkingFloor, int hour){
        this.vehicle=vehicle;
        this.parkingFloor=parkingFloor;
        this.hour=hour;
    }
}
