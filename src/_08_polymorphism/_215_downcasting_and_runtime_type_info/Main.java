package _08_polymorphism._215_downcasting_and_runtime_type_info;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Animal animal = dog;

        animal.eat();
        //OUTPUT: animal is eating
        //animal.run(); is not available, because lost during down casting.

        //NOT PROPER USAGE
        //is not available for base Class Animal

        //Cat cat = (Cat)animal;
        //cat.run();
        //OUTPUT:  Class cast Exception
        //Because dog cannot be converted to cat
        //END OF NOT PROPER USAGE

        //PROPER USAGE
        if(animal instanceof Dog) {
            Dog dog1 = (Dog) animal;
            dog1.run();
        }
    }
}

class Animal{
    int name;
    void eat(){
        System.out.println("animal is eating");
    }
}

class Dog extends Animal{
    void run(){
        System.out.println("Dog is running");
    }
}

class Cat extends Animal{
    void run(){
        System.out.println("Cat is running");
    }
}