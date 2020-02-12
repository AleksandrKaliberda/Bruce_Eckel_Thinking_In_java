package _09_interfaces._277_extending_interface_with_inheritance;

/*
(2) Create three interfaces, each with two methods. Inherit a new interface
that combines the three, adding a new method. Create a class by implementing the new
interface and also inheriting from a concrete class. Now write four methods, each of which
takes one of the four interfaces as an argument. In main( ), create an object of your class
and pass it to each of the methods.
 */

interface MoveBehavior{
    void walk();
    void run();
}

interface SleepBehavior{
    void sleep();
    void wakeUp();
}

interface EatBehavior{
    void startEating();
    void endEating();
}

interface Liveable extends MoveBehavior, SleepBehavior, EatBehavior{
    void breathe();
}

class Animal implements Liveable{
    @Override
    public void walk() {
        System.out.println("walk");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void wakeUp() {
        System.out.println("wake up");
    }

    @Override
    public void startEating() {
        System.out.println("start eating");
    }

    @Override
    public void endEating() {
        System.out.println("stop eating");
    }

    @Override
    public void breathe() {
        System.out.println("breathe");
    }
}

class Human extends Animal{
    void move(MoveBehavior moveBehavior){
        moveBehavior.run();
        moveBehavior.walk();
    }

    void sleep(SleepBehavior sleepBehavior){
        sleepBehavior.sleep();
        sleepBehavior.wakeUp();
    }
}

public class Exercise14 {
    public static void main(String[] args) {

        Human h = new Human();
        h.move(h);
        h.sleep(h);
    }
}
