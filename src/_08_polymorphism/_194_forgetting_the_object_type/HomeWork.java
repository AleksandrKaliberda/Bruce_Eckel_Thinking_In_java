package _08_polymorphism._194_forgetting_the_object_type;

import java.util.Arrays;
import java.util.List;

/*
Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.

Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which
returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
polymorphism works.
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
        System.out.println("Ride Cycle" );
        wheels();
    }
    void wheels(){
        System.out.println("No wheels");
    }
}

class Unicycle extends Cycle{
    void ride(){
        System.out.println("Ride Unicycle");
        wheels();
    }
    void wheels(){
        System.out.println("One wheel");
    }
}

class Bicycle extends Cycle{
    void ride(){
        System.out.println("Ride Bicycle");
        wheels();
    }
    void wheels(){
        System.out.println("Two wheels");
    }
}

class Tricycle extends Cycle{
    void ride(){
        System.out.println("Ride Tricycle");
        wheels();
    }
    void wheels(){
        System.out.println("Three wheels");
    }

}

class Circus{
    void rideOnRope(Cycle cycle){
        cycle.ride();
    }
}