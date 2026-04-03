package CoffeeShop;

public class Main {
    public static void main(String[] args) {
        IBaseBeverage espresso=new Espresso();
        System.out.println(espresso.display());
        IDecorator simpleDecorator=new SimpleDecorator(espresso);
        System.out.println(simpleDecorator.display());
        IDecorator milkDecorator=new MilkDecorator(simpleDecorator);
        System.out.println(milkDecorator.display());
        IDecorator whipDecorator=new WhipDecorator(milkDecorator);
        System.out.println(whipDecorator.display());
    }


}
