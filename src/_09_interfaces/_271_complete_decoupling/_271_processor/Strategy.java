package _09_interfaces._271_complete_decoupling._271_processor;

class Go{
    void go(){}
}

class GoByWalk extends Go{
    @Override
    void go(){
        System.out.println("Let's GoByWalk");
    }
}

class GoByPlain extends Go{
    @Override
    void go(){
        System.out.println("Let's GoByPlain");
    }
}

class Strategy {

    // Go goWay - объект аргумент в методе move()
    // поведение метода move() изменяется в зависимости от
    // переданного объекта аргумента
    static void move(Go goWay){
        goWay.go();
    }

    public static void main(String[] args) {
        Strategy.move(new GoByWalk());
        Strategy.move(new GoByPlain());

    }
}
/*
        OUTPUT:
        Let's GoByWalk
        Let's GoByPlain
 */