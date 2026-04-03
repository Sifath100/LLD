package ElevatorManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floors;
    List<Elevator> elevators;

    public Building(){
        this.floors=new ArrayList<>();
        this.elevators=new ArrayList<>();
    }

    public void addFloor(Floor floor){
        floors.add(floor);
    }
    public void addElevator(Elevator elevator){
        elevators.add(elevator);
    }

    public Elevator nearestLift(Floor floor,Direction direction){
        //we can improve on this algorithm
        //assuming large value for distance
        int distance=1000;
        Elevator assigned = null;
        for(Elevator elevator:elevators){
            if(elevator.getCurrentDirection()==direction && distance>(Math.abs(elevator.getCurrentFloor().getFloorValue()-floor.getFloorValue()))){
                distance=Math.abs(elevator.getCurrentFloor().getFloorValue()-floor.getFloorValue());
                assigned=elevator;
            }
        }
        if(assigned==null){
            //no elevator was assigned as no elevator matched direction
            System.out.println("Sorry no elevator is moving in user's direction,please try again later");
            return null;
        }
        return assigned;
    }
}
