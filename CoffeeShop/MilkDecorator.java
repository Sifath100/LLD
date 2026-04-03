package CoffeeShop;

public class MilkDecorator implements IDecorator{
    IDecorator iDecorator;
    int cost=2;
    StringBuilder sb;
    public MilkDecorator(IDecorator iDecorator){
        this.iDecorator=iDecorator;
        this.addDecorator();
    }
    @Override
    public String display() {
        return "Added milk"+" "+this.cost;
    }

    @Override
    public IDecorator addDecorator() {
        this.cost=iDecorator.getCost()+cost;
        this.sb=iDecorator.getDescription().append(" added milk");
        this.display();
        return this;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public StringBuilder getDescription() {
        return this.sb;
    }
}
