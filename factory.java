interface ITransport{
    public void deliver();
}

class Truck implements ITransport{
    @Override
    public void deliver(){
        System.out.println("Truck delivery by land");
    }
}
class Ship implements ITransport{

    @Override
    public void deliver() {
        System.out.println("Ship delivery by sea");
    }
}

abstract class Logistics{
    public void planDelivery(){
        ITransport transport=createTransport();
        transport.deliver();
    }
    protected abstract ITransport createTransport();
}
class RoadLogistics extends Logistics{

    @Override
    protected ITransport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics{
    @Override
    protected ITransport createTransport() {
        return new Ship();
    }
}

public class factory {
    public static void main(String[] args) {
        Logistics roadLogistics=new RoadLogistics();
        roadLogistics.planDelivery();
        Logistics seaLogistic=new SeaLogistics();
        seaLogistic.planDelivery();
    }
}