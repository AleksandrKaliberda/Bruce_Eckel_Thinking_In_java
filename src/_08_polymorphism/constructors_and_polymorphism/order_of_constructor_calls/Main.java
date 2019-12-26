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
        Pickle()
        Sandwich()

        The order of the constructor calls is important. When you inherit, you know all about the
        base class and can access any public and protected members of the base class. This means
        that you must be able to assume that all the members of the base class are valid when you’re
        in the derived class. In a normal method, construction has already taken place, so all the
        members of all parts of the object have been built. Inside the constructor, however, you must
        be able to assume that all members that you use have been built. The only way to guarantee
        this is for the base-class constructor to be called first.
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
    private Pickle p = new Pickle();
    Sandwich() {System.out.println("Sandwitch()");
    }
}

//Exercise 11: (1) Add class Pickle to Sandwich.java.
class Pickle{
    Pickle(){
        System.out.println("Pickle()");
    }
}