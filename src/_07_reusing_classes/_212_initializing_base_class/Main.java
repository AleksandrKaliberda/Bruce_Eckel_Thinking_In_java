package _07_reusing_classes._212_initializing_base_class;

/*
Java automatically inserts calls to the base-class constructor in the
derived-class constructor.
 */
class Animal{
    Animal(){
        System.out.println("Animal()");
    }
}

class Human extends Animal{
    Human(){
        System.out.println("Human()");
    }
}

class European extends Human{
    European(){
        System.out.println("European()");
    }
}

class Main {
    public static void main(String[] args) {
    European european = new European();
    }
    /*
    Animal()
    Human()
    European()
     */
}
