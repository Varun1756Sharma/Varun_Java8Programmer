import java.util.*;

class Animal{
    void speak(){
        System.out.println("Animal speaks");
    }
    void walk(){
        System.out.println("Animal Walks");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats");
    }
    void speak(){
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal obj = new Dog(); //obj is reference variable of Animal
        obj.walk();
        obj.speak();
    }
}