package _08_polymorphism._194_forgetting_the_object_type;

import java.util.Arrays;
import java.util.List;

/*
Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 */
class HomeWork {
    public static void main(String[] args) {
        Circus circus = new Circus();

        //Upcasting
        List<Cycle> listAnimal= Arrays.asList(new Unicycle(), new Bicycle(), new Tricycle());
        //Dynamic binding or late binding or run-time binding
        listAnimal.forEach(cycle -> cycle.ride());

        System.out.println("\nIn circus, ride bicycle on the rope");
        //Upcasting
        listAnimal.forEach(cycle -> circus.rideOnRope(cycle));
    }
}

class Cycle{
    void ride(){
        System.out.println("Ride Cycle");
    }
}

class Unicycle extends Cycle{
    void ride(){
        System.out.println("Ride Unicycle");
    }
}

class Bicycle extends Cycle{
    void ride(){
        System.out.println("Ride Bicycle");
    }
}

class Tricycle extends Cycle{
    void ride(){
        System.out.println("Ride Tricycle");
    }
}

class Circus{
    void rideOnRope(Cycle cycle){
        cycle.ride();
    }
}