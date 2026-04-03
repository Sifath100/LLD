package ElevatorManagementSystem;

public class User {
    private Floor currentFloor;
    //could add properties such as weight
    public User(Floor currentFloor){
        this.currentFloor=currentFloor;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }
}
