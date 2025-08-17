package Singleton;

public class Dog {
    //this shall also be a singleton class
    int age;
    String breed;
    static Dog dog;

    private Dog(){
        this.age=3;
        this.breed="golden Retriever";
    }

    public static Dog getDog(){
        if(dog==null){
            return dog=new Dog();
        }
        return dog;
    }
}
