public class singleton {
    public static void main(String[] args) {
        Animal animal1=Animal.createAnimal();
        Animal animal2=Animal.createAnimal();
        System.out.println(animal1==animal2);

    }
}

class Animal{
    // lets have setters and getters for it
    String type;
    int age;
    static Animal singletonAnimal;

    //we will set constructor as private
    private Animal(String type,int age){
        this.type=type;
        this.age=age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public static Animal createAnimal(){
        if(singletonAnimal==null){
            singletonAnimal =new Animal("Doraemon",12);
        }
        return singletonAnimal;
    }

}