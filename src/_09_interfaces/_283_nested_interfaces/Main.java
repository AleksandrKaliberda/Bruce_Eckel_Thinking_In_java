package _09_interfaces._283_nested_interfaces;

class A {



    interface B {
        void f();
    }//End interface B

    public class BImp implements B {
        public void f() {
        }
    }//End class BImp

    private class BImp2 implements B {
        public void f() {
        }
    }//End class BImp2




    public interface C {
        void f();
    }//End interface C

    class CImp implements C {
        public void f() {
        }
    }//End class CImp

    private class CImp2 implements C {
        public void f() {
        }
    }//End class CImp2



    //Нельзя реализовать private interface, кроме как
    //внутри класса где он был определён.
    private interface D {
        void f();
    }//End interface D

    private class DImp implements D {
        public void f() {
        }
    }//End class DImp

    public class DImp2 implements D {
        public void f() {
        }
    }//End class DImp2

    //Method
    public D getD() {
        return new DImp2();
    }

    //Field
    private D dRef;

    //Method
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }

}//end class A



interface E {

        interface G {
            void f();
        }//End interface G

        // Redundant "public":
        public interface H {
            void f();
        }//End interface H

        void g();
        // Cannot be private within an interface:
        //Illegal combination of modifiers 'public' & 'private'
        //private interface I {}

    }//End interface E



class NestingInterfaces {

    public class BImp implements A.B {
        public void f() {
        }//end class BImp
    }

    class CImp implements A.C {
        public void f() {
        }
    }//end class CImp

    //Нельзя реализовать private interface, кроме как
    //внутри класса где он был определён.
    //class DImp implements A.D {
    // public void f() {}
    //}

    class EImp implements E {
        public void g() {
        }
    }//end class EImp

    class EGImp implements E.G {
        public void f() {
        }
    }//end class EGImp

    class EImp2 implements E {
        public void g() {
        }

        class EG implements E.G {
            public void f() {
            }
        }
    }//end class EGImp2



    public static void main(String[] args) {
        A a = new A();
        // Can’t access A.D:
        //! A.D ad = a.getD();
        // Doesn’t return anything but A.D:
        //! A.DImp2 di2 = a.getD();
        // Cannot access a member of the interface:
        //! a.getD().f();
        // Only another A can do anything with getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}//End class NestingInterfaces
