package _07_reusing_classes._213_constructors_with_arguments;

/*
Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments
instead of default constructors. Write a constructor for C and perform all initialization within
C’s constructor
 */

class A{
    A(int i){
        System.out.println("Inside A");
    }
}

class B extends A{
    B(int i){
        super(i);
        System.out.println("Inside B");
    }
}

class C extends B{
    C(int i){
        super(i);
        System.out.println("Inside C");
    }
}

class BE_07_Exercise_7 {
    public static void main(String[] args) {
        C c = new C(4);
        /*
        OUTPUT:
        Inside A
        Inside B
        Inside C
         */
    }
}
