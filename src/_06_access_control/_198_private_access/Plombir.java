package _06_access_control._198_private_access;

class Plombir {

    //Plombir object creation is blocked.
    private Plombir(){};

    //Plombir object creation by method
    static Plombir makePlombir(){
        return new Plombir();
    }

}

class IceCream{
    public static void main(String[] args) {

        //Plombir p = new Plombir(); //Cannot create and object Plombir

        Plombir p1 = Plombir.makePlombir();
        System.out.println("p1: "+ p1);

    }
}