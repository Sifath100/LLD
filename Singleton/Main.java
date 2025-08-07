package Singleton;

public class Main {
    public static void main(String[] args) {
        Cat cat=Cat.getCat();
        System.out.println(cat.age+" "+cat.name);
        Cat cat2=Cat.getCat();
        System.out.println(cat2==cat);
    }
}
