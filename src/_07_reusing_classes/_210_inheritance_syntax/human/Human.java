package _07_reusing_classes._210_inheritance_syntax.human;

import _07_reusing_classes._210_inheritance_syntax.monkey.Monkey;

public class Human extends Monkey {

    public void eat(){
        super.eat();
        setStory(getStory()+"by spoon");
    }


//    String go(){
//        return super.go() + " by car";
//    }

}