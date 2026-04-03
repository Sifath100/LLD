package ElevatorManagementSystem;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Elevator {
    private Floor currentFloor;
    private Direction currentDirection;
    private String elevatorName;
    private PriorityQueue<Floor> elevatorController;

    //assume all elevators go all floors , we can modify this later
    //we have also assumed each elevator can carry any number of people

    Elevator(Floor currentFloor,Direction currentDirection,String elevatorName){
        this.currentFloor=currentFloor;
        this.currentDirection=currentDirection;
        this.elevatorName=elevatorName;
    }

    @Override
    public String toString() {
        return elevatorName;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public String getElevatorName() {
        return elevatorName;
    }

    public void addRequest(Floor floor){
        elevatorController.add(floor);
    }

//    public void runRequest(){
//        while()
//    }
}
