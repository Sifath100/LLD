package Strategy;

interface Animal{
    public void display();
}

interface HuntBehavior{
    public void hunt();
}

interface SleepBehavior{
    public void sleep();
}

class AggresiveHunt implements HuntBehavior{
    @Override
    public void hunt(){
        System.out.println("THUDDDD Hunting");
    }
}

class stealthHunt implements HuntBehavior{
    @Override
    public void hunt(){
        System.out.println("Shhh hunting");
    }
}

class irregularSleepers implements SleepBehavior{
    @Override
    public void sleep(){
        System.out.println("Sleep wake sleep wake");
    }
}

class continuosSleepers implements SleepBehavior{
    @Override
    public void sleep() {
        System.out.println("Sleeeeeeeeeepppp Wake");
    }
}

class Cat implements Animal{
    HuntBehavior huntBehavior;
    SleepBehavior sleepBehavior;
    public Cat(){}

    public Cat(HuntBehavior huntBehavior,SleepBehavior sleepBehavior){
        this.huntBehavior=huntBehavior;
        this.sleepBehavior=sleepBehavior;
    }
    @Override
    public void display() {
        huntBehavior.hunt();
        sleepBehavior.sleep();
    }
}
public class Main {
    public static void main(String[] args) {
        Animal cat=new Cat(new AggresiveHunt(),new irregularSleepers());
        cat.display();
        Animal kitty=new Cat();
        kitty.display();
    }
}
