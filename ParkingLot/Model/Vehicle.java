package ParkingLot.Model;

public class Vehicle {
    int id;
    VehicleType vehicleType;

    public int getId() {
        return id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle(int id, VehicleType vehicleType){
        this.id=id;
        this.vehicleType=vehicleType;
    }
}
