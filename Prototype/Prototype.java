package Prototype;

import java.util.HashSet;

class Animal{
    String type;
    int age;
    static Animal animal;

    private Animal(String type,int age){
        this.type=type;
        this.age=age;
    }
    private Animal(Animal animal){
        this.age=animal.age;
        this.type=animal.type;
        System.out.println("Hey successfully created a clone "+ animal.type+" "+animal.age);
    }
    public static Animal createAnimal(){
        if(Animal.animal==null){
//            System.out.println("here we go again?");
            return Animal.animal=new Animal("Doraemon",12);
        }
        return Animal.animal;
    }
    public Animal cloneAnimal(){
        if(Animal.animal==null){
//            System.out.println("here we go");
            return Animal.animal=createAnimal();
        }
        return new Animal(Animal.animal);
    }
//    @Override
//    public String toString(){
//        return this.type+" "+this.age;
//    }
}

public class Prototype {
    public static void main(String[] args) {
        //we shall create a prototype of animal class
        Animal doraemon=Animal.createAnimal();
        HashSet<Animal> animals=new HashSet<>();
        for(int i=0;i<100;i++){
            Animal newDoraemon=doraemon.cloneAnimal();
            System.out.println(newDoraemon.type+" "+newDoraemon.age);
            animals.add(newDoraemon);
        }
        System.out.println(animals.size());//shows set with 100 dublicate animals
        System.out.println(doraemon);
    }
}
