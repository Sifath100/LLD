class A{
    int value;
    String name;

    public void printer(B b){
        System.out.println("Hello from printer "+b.toString());
    }
}
class B{
    int value;
    String name;

    B(int value,String name){
        this.value=value;
        this.name=name;
    }

    @Override
    public String toString(){
        return this.value+" oye papaji "+this.name;
    }
}

public class main {
    public static void main(String[] args) {
        B b=new B(23,"Sifath");
        A a=new A();
        a.printer(b);
    }
}
