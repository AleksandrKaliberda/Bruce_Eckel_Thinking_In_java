package _06_access_control._199_protected_access.human;


import _06_access_control._199_protected_access.animal.Monkey;

public class Human extends Monkey {
    protected String humanEating(){
        return animalEating() + "At table. ";
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.humanEating());
    }
}
