package Singleton;

public class Cat {
    int age;
    String name;
    static Cat cat=null;

    private Cat(int age,String name){
        this.age=age;
        this.name=name;
    }

    public static Cat getCat(){
        if(cat!=null){
            return cat;
        }
        return cat=new Cat(10,"whiskers");
    }
}
