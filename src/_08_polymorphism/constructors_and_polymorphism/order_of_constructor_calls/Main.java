package _08_polymorphism.constructors_and_polymorphism.order_of_constructor_calls;

class Main {
    public static void main(String[] args) {
        new Sandwich();

        /*
        1. The base-class constructor is called. This step is repeated recursively such
        that the root of the hierarchy is constructed first, followed by the
        next-derived class, etc., until the most-derived class is reached.

        2. Member initializers are called in the order of declaration.

        3. The body of the derived-class constructor is called.

        Output:
        Meal()
        Lunch()
        PortableLunch()
        Bread()
        Cheese()
        Lettuce()
        Sandwich()
         */
    }
}

//Will be called first as most base-class
class Meal{
    Meal(){ System.out.println("Meal()");}
}

class Bread{
    Bread(){ System.out.println("Bread()");}
}

class Cheese{
    Cheese(){ System.out.println("Cheese()");}
}

class Lettuce{
    Lettuce(){ System.out.println("Lettuce()");}
}

//Will be called second as second base class
class Lunch extends Meal{
    Lunch(){ System.out.println("Lunch()");}
}

//Will be called third as third base class
class PortableLunch extends Lunch {
    PortableLunch (){ System.out.println("PortableLunch()");}
}

/*
The important class is Sandwich, which reflects three levels of
inheritance (Meal->Lunch->PortableLunch).
Sandwich is the most derived class.
 */
class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    Sandwich() {System.out.println("Sandwitch()");
    }
}