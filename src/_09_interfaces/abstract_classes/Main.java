package _09_interfaces.abstract_classes;

/*
ABSTRACT CLASSES

1. Cannot have abstract methods without abstract class
2. Can be extended only from one class
3. Class must be abstract or implement abstract method
4. Abstract class Can have constructor
5. Not abstract methods can work with abstract class fields
6. Abstract class object, cannot be instantiated
7. Access can be package or "friendly"
8. Can implement interfaces
*/

abstract class Creature{

}
abstract class Creature1{

}
interface GoBehavior{
    void sleep();
}

////Cannot have abstract methods without abstract class
////class Animal must be abstract or implement abstract method go()
//class Animal{
//
//    //abstract method in non abstract class
//    abstract void go(){}
//}

//Can be extended only from one class
//abstract class Animal extends Creature, Creature1{
abstract class Animal extends Creature implements GoBehavior{
    String name;
    //Abstract class Can have constructor
    public Animal(String name) {
        this.name = name;
    }

    //not abstract methods can work with abstract class fields
    void setOtherName(String name){
        this.name = name;
    }

    //abstract class methods can be protected, so subclass implemented
    //method must be protected as well
    protected abstract void go();

}

//class Dog must either be declared abstract or implement abstract method go() in Animal.

//If you cannot implement abstract method sleep() in subclass (Dog),
//you must implement sleep() method in next Dog's subclass 'PitBull'
abstract class Dog extends Animal{
    //pass value to abstract class Animal constructor
    Dog(String name){
        super(name);
    }

    //abstract class methods can be protected, so subclass implemented
    //method must be protected as well
    @Override
    protected void go() {

    }

    //Subclass Dog will not implement method sleep(), so,
    //Dog's subclass 'Pitbull' must implement method sleep()

}

class PitBull extends Dog{

    public PitBull(String name) {
        super(name);
    }

    //Subclass Dog didn't implement method sleep(), so,
    //Dog's subclass 'Pitbull' must implement method sleep()
    @Override
    public void sleep() {

    }

}

class Main {

    ////Animal is abstract, cannot be instantiated
    //Animal animal = new Animal();

    public static void main(String[] args) {
        Main m = new Main();
        PitBull pitBull = new PitBull("Bobik");
    }
}
