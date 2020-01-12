package _08_polymorphism.parametric_polymorphism;

public class SimpleGenerics {

    public static void main(String[] args) {

        //SIMPLE ONE ELEMENT COLLECTION
        //STORE AUTOMOBILE
        Holder2 h2 = new Holder2(new Automobile());
        System.out.println(h2);

        Automobile automobile1 = (Automobile)h2.get();
        System.out.println(automobile1);

        //STORE STRING
        h2.set("Not an Automobile");
        String s = (String)h2.get();
        System.out.println(s);

        //STORE INTEGER
        h2.set(1); // Autoboxes to Integer
        Integer x = (Integer)h2.get();
        System.out.println(x);

        //MORE ADVANCED GENERIC
        Holder3<Automobile> h3 = new Holder3<>();
        h3.set(new Automobile());//Type checked
        Automobile automobile2 = h3.get(); // No cast needed
        System.out.println(automobile2);
        // h3.set("Not an Automobile"); // Error
        // h3.set(1); // Error

    }

}

//SIMPLEST WAY TO STORE AN AUTOMOBILE OBJECT
//: generics/Holder1.java
class Automobile {}

class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) { this.a = a; }
    Automobile get() { return a; }
} ///:~

//CAN SET AND GET AN OBJECT TYPE (INCLUDING STRING, INTEGER, AUTOMOBILE
//: generics/Holder2.java
class Holder2 {
    private Object a;
    public Holder2(Object a) {
        this.a = a;
    }
    public void set(Object a) { this.a = a; }
    public Object get() { return a; }

    @Override
    public String toString() {
        return "Holder2{" +
                "a=" + a +
                '}';
    }
} ///:~

//: generics/Holder3.java
class Holder3<E> {
    private E a;
    public Holder3(){};
    public Holder3(E a) { this.a = a; }
    public void set(E a) { this.a = a; }
    public E get() { return a; }

    @Override
    public String toString() {
        return "Holder3{" +
                "a=" + a +
                '}';
    }
} ///:~

