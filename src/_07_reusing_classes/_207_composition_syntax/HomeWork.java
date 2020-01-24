package _07_reusing_classes._207_composition_syntax;

/*
Exercise 1: (2) Create a simple class. Inside a second class, define a
reference to an object of the first class. Use lazy initialization to
instantiate this object.
 */
public class HomeWork {
    public static void main(String[] args) {

        B b = new B();
        b.instantializeA();

        /*
        OUTPUT:
        inside A
         */
    }
}

class A{
    int x;

    A(int x){
        System.out.println("inside A");
        this.x=x;
    }
}

class B{
    A a;

    //Delayed or lazy initialization
    void instantializeA(){
        a = new A(5);
    }
}