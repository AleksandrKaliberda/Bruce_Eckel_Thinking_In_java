package _07_reusing_classes._215_delegation;



class HeadLogic{
    void up(int x){
        System.out.println("LOGIC TO: turn head up " + x);
    }
    void down(int x){
        System.out.println("LOGIC TO: turn head down " + x);
    }
    void left(int x){
        System.out.println("LOGIC TO: turn head left " + x);
    }
    void right(int x){
        System.out.println("LOGIC TO: turn head right " + x);
    }
}

/*
However, a RobotHead isn’t really “a type of” HeadLogic, even if, for example,
you “tell” a RobotHead to rotate down( ). It’s more accurate to say that a RobotHead
contains HeadLogic, and at the same time all the methods in
HeadLogic are exposed in a SpaceShip.
 */
//class RobotHead extends HeadLogic{
//    public static void main(String[] args) {
//        Robot robot = new Robot("R2-D2");
//        robot.robotHead.down(2);
//    }
//}

class RobotHead{
    HeadLogic headLogic = new HeadLogic();

    //Delegated methods
    /*
    You can see how the methods are forwarded to the underlying 'headLogic' object, and the
    interface is thus the same as it is with inheritance. However, you have more control with
    delegation because you can choose to provide only a subset (небольшим подмножество) of
    the methods in the member object.

    Although the Java language doesn’t support delegation, development tools often do. The
    above example, for instance, was automatically generated using the JetBrains Idea IDE
     */
    void up(int x ){headLogic.up(x);}
    void down(int x ){headLogic.down(x);}
    void left(int x ){headLogic.left(x);}
    void right(int x ){headLogic.right(x);}
}

class Robot{
    String name;
    RobotHead robotHead = new RobotHead();

    public Robot(String name) {
        this.name = name;
    }
}

class Main {

    public static void main(String[] args) {

    Robot robot1 = new Robot("R2-D2");
    robot1.robotHead.down(3);
    robot1.robotHead.up(3);
    }
}
