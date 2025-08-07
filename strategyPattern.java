interface iQuackBehaviour{
    void quack();
}

interface iFlyBehaviour{
    void fly();
}

class RapidQuack implements iQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quacking rapidly");
    }
}

class SlowQuack implements iQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quaking slowly");
    }
}

class JetFly implements iFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying jet speed wooooohhhhh");
    }
}

class ParachuteFly implements iFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying really slowly and in stable position");
    }
}

class Duck{
    iQuackBehaviour qB;
    iFlyBehaviour fB;
    Duck(iQuackBehaviour qB,iFlyBehaviour fB){
        this.qB=qB;
        this.fB=fB;
    }

    public void quack(){
        this.qB.quack();
    }
    public void fly(){
        this.fB.fly();
    }
}

public class strategyPattern {
    public static void main(String[] args) {
        Duck ducky=new Duck(new RapidQuack(),new ParachuteFly());
        ducky.quack();
        ducky.fly();
    }
}