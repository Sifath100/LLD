package ParkingLot.Model;

public class ParkingFloor {
    int capacityTwoWheeler;
    int capacityFourWheeler;
    int countTwoWheeler;
    int countFourWheeler;

    public ParkingFloor(int capacityTwoWheeler, int capacityFourWheeler){
        this.capacityTwoWheeler=capacityTwoWheeler;
        this.capacityFourWheeler=capacityFourWheeler;
    }

    public int getCapacityTwoWheeler() {
        return capacityTwoWheeler;
    }

    public int getCapacityFourWheeler() {
        return capacityFourWheeler;
    }
    public boolean validateParkingFloor(){
        return countTwoWheeler==capacityTwoWheeler || countFourWheeler==capacityFourWheeler;
    }

    public void occupySpot(Vehicle vehicle){
        if(vehicle.vehicleType==VehicleType.TWO_WHEELER){
            countTwoWheeler++;
        }
        else{
            countFourWheeler++;
        }
    }
    public void vacateSpot(Vehicle vehicle){
        if(vehicle.vehicleType==VehicleType.TWO_WHEELER){
            countTwoWheeler--;
        }
        else{
            countFourWheeler--;
        }
    }
}
