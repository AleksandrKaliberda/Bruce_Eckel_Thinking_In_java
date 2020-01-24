package _07_reusing_classes._210_inheritance_syntax;

import _07_reusing_classes._210_inheritance_syntax.human.Human;

class Main {
    public static void main(String[] args) {

        Human human = new Human();

        //Eat story
        human.eat();
        System.out.println(human.getStory());

        //Go story
        //Is not available, because Monkey.go() is not public
        //so is not available in other package human
//        System.out.println(human.go());
    }
}