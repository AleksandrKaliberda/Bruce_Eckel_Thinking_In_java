package _07_reusing_classes._222_choosing_composition_vs_inheritance;

/*
Both composition and inheritance allow you to place subobjects inside your new class
(composition explicitly does this—with inheritance it’s implicit).

Composition is generally used when you want the features of an existing class inside your
new class, but not its interface.

Sometimes it makes sense to allow the class user to directly access the composition of your
new class; that is, to make the member objects public.
The member objects use implementation hiding themselves, so this is a safe thing to
do. When the user knows you’re assembling a bunch of parts, it makes the interface
easier to understand.

When you inherit, you take an existing class and make a special version of it. In general, this
means that you’re taking a general-purpose class and specializing it for a particular need.
With a little thought, you’ll see that it would make no sense to compose a car using a vehicle
object—a car doesn’t contain a vehicle, it is a vehicle.

The is-a relationship is expressed with
inheritance, and the has-a relationship is expressed with composition.
 */

class Hand{
    public void push(){
        System.out.println("push");
    }
    public void pull(){
        System.out.println("pull");
    }
}

class Foot{
    public void go(){
        System.out.println("go");
    }
    public void run(){
        System.out.println("run");
    }
    public void jump(){
        System.out.println("jump");
    }
}

class Head{
    public void think(){
        System.out.println("think");
    }
    public void speak(){
        System.out.println("speak");
    }
    public void watch(){
        System.out.println("watch");
    }
}

class Fly{
    public void flyByRocket(){
        System.out.println("fly by rocket");
    }
}

class Robot{

    String name;

    Head head = new Head();

    Hand leftHand = new Hand();
    Hand rightHand = new Hand();

    Foot leftFoot = new Foot();
    Foot rightFoot = new Foot();

    public Robot(String name) {
        this.name = name;
    }
}

class FlyingRobot extends Robot{
    FlyingRobot(String name){
        super(name);
    }

    Fly flyWay = new Fly();
}

class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("R2-D2");

        robot1.head.speak();
        robot1.head.think();
        robot1.head.watch();

        robot1.leftFoot.go();
        robot1.rightFoot.go();

        robot1.leftHand.pull();

        FlyingRobot flyingRobot1 = new FlyingRobot("Flying R2-D2");
        flyingRobot1.flyWay.flyByRocket();

        /*
        OUTPUT:
        speak
        think
        watch
        go
        go
        pull
        fly by rocket
         */
    }
}
