package _07_reusing_classes._213_constructors_with_arguments;

/*
Exercise 8: (1) Create a base class with only a non-default constructor, and a derived
class with both a default (no-arg) and non-default constructor. In the derived-class
constructors, call the base-class constructor.
 */
class D{
    D(int i){}
}

class E extends D{

    //ERROR will come
    //There is no default constructor available in D
    //E(){}

    E(int i){

        super(9);
    }
}
class BE_07_Exercise_8 {

}
