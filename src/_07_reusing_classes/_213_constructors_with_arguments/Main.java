package _07_reusing_classes._213_constructors_with_arguments;


/*
If your class doesn’t have default arguments, or if you want to call a base-class constructor
that has an argument:
 -You must explicitly write the calls to the base-class constructor using
    the 'super' keyword and the appropriate argument list
 If you don’t call the base-class constructor in BoardGame( ), the compiler will complain
    that it can’t find a constructor of the form Game( ).

    In addition, the call to the
    base-class constructor must be the first thing you do in the derived-class
    constructor. (The compiler will remind you if you get it wrong.
 */

class Game {
    Game(int i) {
        System.out.println("Game constructor");
        System.out.println("Num " + i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
        System.out.println("Num " + i);
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
}

 class Main {
     public static void main(String[] args) {

         Chess x = new Chess();
         /* Output:
        Game constructor
        BoardGame constructor
        Chess constructor
        *///:~
     }
}
