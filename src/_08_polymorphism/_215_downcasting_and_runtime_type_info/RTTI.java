package _08_polymorphism._215_downcasting_and_runtime_type_info;

//: polymorphism/RTTI.java
// Downcasting & Runtime type information (RTTI).
// {ThrowsException}
    class Useful {
        void f() {
            System.out.println("Useful void f()");
        }
        void g(){
            System.out.println("Useful void g()");
        }
    }
    class MoreUseful extends Useful {
        void f(){
            System.out.println("MoreUseful void f()");
        }
        void g(){
            System.out.println("MoreUseful void g()");
        }
        void u(){
            System.out.println("MoreUseful void u()");
        }
        void v(){
            System.out.println("MoreUseful void v()");
        }
        void w(){
            System.out.println("MoreUseful void w()");
        }
    }
    class RTTI {
        public static void main(String[] args) {
            Useful[] x = {
                    new Useful(),
                    new MoreUseful()
            };

            x[0].f();//Useful
            x[1].g();//MoreUseful

            // Compile time: method not found in Useful:
            //! x[1].u();
            ((MoreUseful)x[1]).u(); // Downcast/RTTI (It was attempt to call MoreUseful u() method of second element)
            ((MoreUseful)x[0]).u(); // Exception thrown (java.lang.ClassCastException)
        }

        /*
        OUTPUT:
        Useful void f()
        MoreUseful void g()
        MoreUseful void u()
        Exception in thread "main" java.lang.ClassCastException:
        _08_polymorphism._215_downcasting_and_runtime_type_info.Useful cannot be cast to
        _08_polymorphism._215_downcasting_and_runtime_type_info.MoreUseful
        at _08_polymorphism._215_downcasting_and_runtime_type_info.RTTI.main(RTTI.java:44)
         */
    } ///:~
