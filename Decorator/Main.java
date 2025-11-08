package Decorator;

interface Coffee{
    public String getDescription();
    public int cost();
}

class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
    @Override
    public int cost() {
        return 50;
    }
}

class MilkDecorator implements Coffee{
    Coffee coffee;
    public MilkDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" + milk";
    }

    @Override
    public int cost() {
        return coffee.cost()+20;
    }
}

class WhippedCreamDecorator implements Coffee{
    Coffee coffee;
    public WhippedCreamDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" + WhippedCream";
    }

    @Override
    public int cost() {
        return coffee.cost()+5;
    }
}
public class Main {
    public static void main(String[] args) {
        Coffee coffee=new BasicCoffee();
        String str=coffee.getDescription();
        System.out.println(str);
        coffee=new MilkDecorator(coffee);
        coffee=new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription()+" + cost is "+coffee.cost());

    }
}
