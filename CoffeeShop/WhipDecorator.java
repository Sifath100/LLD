package CoffeeShop;

public class WhipDecorator implements IDecorator{
    IDecorator iDecorator;
    int cost=1;
    StringBuilder sb;
    public WhipDecorator(IDecorator iDecorator){
        this.iDecorator=iDecorator;
        this.addDecorator();
    }
    @Override
    public String display() {
        return "Added whip"+" "+this.cost;
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
