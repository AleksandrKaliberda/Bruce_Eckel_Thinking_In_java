package _08_polymorphism._194_forgetting_the_object_type;

import java.util.Arrays;
import java.util.List;

/*
Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.

Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which
returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
polymorphism works.

Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
them to an array of Cycle. Try to call balance( ) on each element of the array and observe
the results. Downcast and call balance( ) and observe what happens
 */
class HomeWork {
    public static void main(String[] args) {
        Circus circus = new Circus();

        //Upcasting
        List<Cycle> cycleList= Arrays.asList(new Unicycle(), new Bicycle(), new Tricycle());
        //Dynamic binding or late binding or run-time binding
        cycleList.forEach(cycle -> RideWheels.ride(cycle));

        System.out.println("Attempt to call cycle.balance() for each element");

        cycleList.get(0).balance();
        cycleList.get(1).balance();

        //ClassCastException will be thrown. Tricycle can't become Unicycle, but can use Cycle's balance method
        //((Unicycle)cycleList.get(2)).balance();

        //Downcast - Tricycle's balance method is used.
        ((Tricycle)cycleList.get(2)).balance();

        /*
        * OUTPUT:
        * Number of wheels: 1
        * Number of wheels: 2
        * Number of wheels: 3
        *
        * Attempt to call cycle.balance() for each element
        *
        * Balance Unicycle
        * Balance Bicycle
        * Since wheels amount is unknown, there is no balance
        */
    }
}

class Cycle{

    int wheels(){
        return 0;
    }

    void balance(){
        System.out.println("Since wheels amount is unknown, there is no balance\n");
    }
}

class Unicycle extends Cycle{

    int wheels(){
        return 1;
    }

    void balance(){
        System.out.println("Balance Unicycle\n");
    }
}

class Bicycle extends Cycle{

    int wheels(){
        return 2;
    }

    void balance(){
        System.out.println("Balance Bicycle\n");
    }
}

class Tricycle extends Cycle{

    int wheels(){
        return 3;
    }

}

class Circus{
//    void rideOnRope(Cycle cycle){
//        cycle.ride();
//    }
}

class RideWheels {
    static void ride(Cycle cycle){
        System.out.println("Number of wheels: " + cycle.wheels());
    }

    static void balance(Cycle cycle){
        cycle.balance();
    }
}