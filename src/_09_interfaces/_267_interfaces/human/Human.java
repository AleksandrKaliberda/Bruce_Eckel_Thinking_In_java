package _09_interfaces._267_interfaces.human;

import _09_interfaces._267_interfaces.behavior.EatBehavior;
import _09_interfaces._267_interfaces.behavior.GoBehavior;
import _09_interfaces._267_interfaces.behavior.HumanBehavior;

//If Interface HumanBehavior is not public, it cannot be accesses from outside package
abstract class Human implements HumanBehavior {
    private String name;
    private GoBehavior goBehavior;
    private EatBehavior eatBehavior;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGoBehavior(GoBehavior goBehavior) {
        //If not check, in method go() can be java.lang.NullPointerException
        if(goBehavior!=null) {
            this.goBehavior=goBehavior;
        }else {
            System.out.println("Please set go behavior first");
        }
    }

    @Override
    public void go() {
        //If not check, can be java.lang.NullPointerException
        if(goBehavior!=null) {
            //Interface static final variable 'TEST' is available here
            System.out.println(getName() + " " + goBehavior.go() + " " + goBehavior.TEST);
        }else {
            System.out.println("Please set go behavior first");
        }
    }

    public void setEatBehavior(EatBehavior eatBehavior) {
        //If not check, in method go() can be java.lang.NullPointerException
        if(eatBehavior!=null) {
        this.eatBehavior = eatBehavior;
        }else {
            System.out.println("Please set eat behavior first");
        }
    }

    @Override
    public void eat() {
        //If not check, can be java.lang.NullPointerException
        if(eatBehavior!=null) {
            //Interface static final variable 'TEST' is available here
            System.out.println(getName() + " " + eatBehavior.eat());
        }else {
            System.out.println("Please set eat behavior first");
        }
    }
}
