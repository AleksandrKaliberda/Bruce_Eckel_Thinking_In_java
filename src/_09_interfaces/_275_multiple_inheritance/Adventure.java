package _09_interfaces._275_multiple_inheritance;

//: interfaces/Adventure.java
// Multiple interfaces.
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println("fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    public void swim() {
        System.out.println("swim");
    }

    public void fly() {
    System.out.println("fly");
    }

}

/*
Класс Adventure содержит 4 метода, которые принимают в качестве
арументов разнообразные интерфейсы и конкретный класс. Созданный
объект Hero передаётся всем этим методам, а это значит, что
выполняется восходящее преобразование объекта к каждому интерфейсу
по очереди
 */
class Adventure {

    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
//    public static void w(ActionCharacter x) { x.fight(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
//        w(h); // Treat it as an ActionCharacter
    }
} ///:~
