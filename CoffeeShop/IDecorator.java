package CoffeeShop;

public interface IDecorator {
    public String display();
    public IDecorator addDecorator();
    public int getCost();
    public StringBuilder getDescription();
}
