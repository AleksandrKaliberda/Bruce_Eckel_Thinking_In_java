package _06_access_control._197_public_access;

//: access/Dinner.java
// Uses the library.
import _06_access_control._197_public_access.access.desert.*;

    class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        //! x.bite(); // Can’t access. method bite() is package private in access.desert packet
    }
} /* Output:
Cookie constructor
*///:~
