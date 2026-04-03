package CoffeeShop;

public class SimpleDecorator implements IDecorator {
    int cost;
    StringBuilder sb;
    public SimpleDecorator(IBaseBeverage iBaseBeverage){
        this.cost=iBaseBeverage.getCost();
        this.sb=iBaseBeverage.getDescription();
    }

    @Override
    public String display(){
        return this.sb.toString();
    }
    @Override
    public IDecorator addDecorator(){
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
