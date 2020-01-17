/*
 If you want to say that all these components (each in its
 own separate .java and .class files) belong
together, that’s where the package keyword comes in.
 */
package _06_access_control._168_package_library_unit;
/*
If you don't want to go with full name
        java.util.ArrayList
            you can use keyword 'import'
 */
import java.util.ArrayList;

class B {
    ArrayList arrayList = new ArrayList();
}
