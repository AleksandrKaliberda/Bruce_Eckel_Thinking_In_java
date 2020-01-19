package _06_access_control._202_class_access;

 class SingletonUseMain {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        /*
        OUTPUT:
        s1: _06_access_control._202_class_access.Singleton@1b6d3586
        s2: _06_access_control._202_class_access.Singleton@1b6d3586
         */
    }
}

class Singleton {
    private static Singleton s = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return s;
    }
}