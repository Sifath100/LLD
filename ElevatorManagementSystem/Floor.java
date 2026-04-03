package ElevatorManagementSystem;

public class Floor {
    private int floorValue;

    public Floor(int floorValue){
        this.floorValue=floorValue;
    }

    public int getFloorValue() {
        return floorValue;
    }

    @Override
    public String toString() {
        return "Floor : "+floorValue;
    }
}
