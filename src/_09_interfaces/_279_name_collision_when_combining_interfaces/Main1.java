package _09_interfaces._279_name_collision_when_combining_interfaces;

interface In1{void fn();}
class Cl1{public int fn(){return 0;} }

//class Cl2 extends Cl1 implements In1{
////class Cl2 extends Cl1{
//
//    //Перегруженные методы не могут различаться только возвращаемыми значениями
//    //fn() in Cl2 clashes with fn() Cl1; attempting to use incompatible return type
////    public int fn(int x) {return 0;}
//    public void fn(int x) {}
//    //Использование одинаковых имён методов в интерфейсах, предназначенных для
//    //совмещения, обычно приводит к запутанному и трудному для чтения коду.
//    //Постарайтесь по возможности избегать таких ситуаций
////    public void fn(int x) {}
//}

//class Cl3{
//    //xf(int) clashes with xf(int); both methods have same erasure
//    public int xf(int x){return 0;} //Перегруженные методы не могут различаться только возвращаемыми значениями
//    public float xf(int x){return 0;}//Перегруженные методы не могут различаться только возвращаемыми значениями
//
//}

class Main1{
    public static void main(String[] args) {

    }
}