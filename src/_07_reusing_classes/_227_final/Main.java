package _07_reusing_classes._227_final;

import java.util.Random;

/*
Final - 'This cannot be changed'
Can be used: for data, methods, and classes

A constant is useful for two reasons:
1. It can be a compile-time constant that won’t ever change.
2. It can be a value initialized at run time that you don’t want changed.

A field that is both static and final has only one piece of storage that cannot be changed.

With an object reference, final makes the reference a constant. Once the reference
is initialized to an object, it can never be changed to point to another object.
However, the object itself can be modified
 */

class Value{
    private int i;

    public Value(int i) {
        this.i = i;
    }
}

class Main {


    // Can be compile-time constants:
    private final int one = 1;
    // private final int two = one++;//Cannot assign a value to final variable 'one'

    // Can be compile-time constants:
    private static final int THREE = 2;

    final int[] arr = {1,2,3};

    private static Random rand = new Random(47);
    //// Cannot be compile-time constants:
    private static final int FOUR = rand.nextInt(40);
    private final Value valueOne = new Value(rand.nextInt(30));

    public static void main(String[] args) {

        final Main main = new Main();
        //main = null;//Cannot assign a value to final variable 'main'

        main.arr[0]=2; //OK
        System.out.println(main.arr[0]);//OUTPUT: 2

        // main.arr = new int[3];//Cannot assign a value to final variable 'main'

    }
}


