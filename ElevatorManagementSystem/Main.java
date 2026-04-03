package ElevatorManagementSystem;

public class Main {
    public static void main(String[] args) {
        Building building=new Building();
        Floor firstFloor=new Floor(1);
        Floor secondFloor=new Floor(2);
        Floor thirdFloor=new Floor(3);
        Floor forthFloor=new Floor(4);
        Elevator elevatorOne=new Elevator(secondFloor,Direction.DOWN,"E1");
        Elevator elevatorTwo=new Elevator(thirdFloor,Direction.UP,"E2");
        User userOne=new User(firstFloor);
        User userTwo=new User(thirdFloor);
        building.addElevator(elevatorOne);
        building.addElevator(elevatorTwo);
        building.addFloor(firstFloor);
        building.addFloor(secondFloor);
        building.addFloor(thirdFloor);
        building.addFloor(forthFloor);

        ElevatorSystem system=new ElevatorSystem(building);


    }
}
