package CoffeeShop;

public class Espresso implements IBaseBeverage{
    int cost=10;
    StringBuilder sb;

    public Espresso(){
        this.sb=new StringBuilder();
        sb.append("Added Espresso"+"\n");
    }

    @Override
    public String display(){
        return sb.toString()+" "+this.cost;
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
