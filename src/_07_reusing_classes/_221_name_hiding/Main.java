package _07_reusing_classes._221_name_hiding;

/*
If a Java base class has a method name that’s overloaded several times, redefining that
method name in the derived class will not hide any of the base-class versions (unlike C++).
Thus overloading works regardless of whether the method was defined at this level or in a
base class.
You can see that overloaded method of Animal is available in Human, even though
Human introduces a new overloaded method (in C++ doing this would hide the base-class
methods). As you’ll see in the next chapter, it’s far more common to override methods of the
same name, using exactly the same signature and return type as in the base class.
 */

class Animal{
    void go(String stringGo){
        System.out.println(stringGo);
    }
}

class Human extends Animal{
    void go (int km){
        System.out.println(km);
    }
    void go (float floatKm){
        System.out.println(floatKm);
    }
}

class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.go(1);
        h.go(1.0f);
        h.go("go one km");
    }
    /*
    OUTPUT:
    1
    1.0
    go one km
     */
}
