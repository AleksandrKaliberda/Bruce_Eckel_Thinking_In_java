package _09_interfaces._277_extending_interface_with_inheritance;

//: interfaces/HorrorShow.java
// Extending an interface with inheritance.
interface Monster {
    void menace();
}
/*
DangerousMonster представляет собой простое расширение Monster,  в результате которого
образуется новый интерфейс. Он реализуется классом DragonZilla.
 */
interface DangerousMonster extends Monster {
    void destroy();
}
interface Lethal {
    void kill();
}
class DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

/*Синтаксис использованный в интерфейсе Vampire, работает только при наследовании интерфейсов.
Обычно ключевое слово extends может использоваться всего с одним классом, но т.к. интерфейс
можно составить из нескольких других интерфейсов, extends подходит для написания нескольких имён
интерфейсов при создании нового интерфейса. Как нетрудно заметить, имена нескольких
интерфейсов разделяются при этом запятыми.*/
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
} ///:~