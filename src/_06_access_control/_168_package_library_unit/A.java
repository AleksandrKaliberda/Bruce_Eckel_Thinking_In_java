/*
 If you want to say that all these components (each in its
 own separate .java and .class files) belong
together, that’s where the package keyword comes in.
 */
package _06_access_control._168_package_library_unit;

class A {
        /*
        One of the classes in java.util is called ArrayList. One way
        to use an ArrayList is to specify the full name java.util.ArrayList.
        This rapidly becomes tedious, so you’ll probably want to use
        the import keyword instead.
         */
        java.util.ArrayList arrayList = new java.util.ArrayList<>();
}