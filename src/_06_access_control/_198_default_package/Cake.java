package _06_access_control._198_default_package;

//: access/Cake.java
// Accesses a class in a separate compilation unit.
//Pie is available, since it in the same package.
class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
} /* Output:
Pie.f()
*///:~