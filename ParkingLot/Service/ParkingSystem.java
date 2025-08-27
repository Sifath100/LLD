package ParkingLot.Service;

import ParkingLot.Model.Ticket;
import ParkingLot.Model.Vehicle;

import java.util.HashMap;

public class ParkingSystem {
    HashMap<Vehicle,Ticket> map;
    public ParkingSystem(){
        map=new HashMap<>();
    }
    public void addVehicle(Vehicle vehicle, Ticket ticket){
        map.put(vehicle,ticket);
    }
    public void removeVehicle(Vehicle vehicle){
        map.remove(vehicle);
    }
    public int calculateCost(Vehicle vehicle,int hour){
        return hour-(map.get(vehicle).hour);
    }
}
