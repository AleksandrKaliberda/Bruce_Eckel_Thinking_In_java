package _09_interfaces._264_abstract_classes_and_interfaces.robots;

import _09_interfaces._264_abstract_classes_and_interfaces.Animal;

public class Robodog extends Animal {

    public Robodog(String name) {
        super(name);
    }

    //Protected method from Animal class, is available in Robodog
    //without key word 'extends', method eat() will not be available
    //in other classes from other package, even if Animal is public
    @Override
    protected void eat() {
        System.out.print("Robo pirate ");
        super.eat();
        System.out.print("electricity ");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
