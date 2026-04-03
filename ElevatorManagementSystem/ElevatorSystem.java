package ElevatorManagementSystem;

public class ElevatorSystem {
    private Building building;
    public ElevatorSystem(Building building){
        this.building=building;
    }

    public void hallCall(User user,Direction direction){
        Elevator assigned = building.nearestLift(user.getCurrentFloor(),direction);
        if(assigned!=null){
            assigned.addRequest(user.getCurrentFloor());
        }
    }

}
