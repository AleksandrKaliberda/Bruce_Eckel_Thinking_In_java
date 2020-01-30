package _07_reusing_classes._227_final;

final class HumanColors{

    static final String WHITE_COLOR = "white color";
    static final String BLACK_COLOR = "black color";
    static final String YELLOW_COLOR = "yellow color";

}

class Human{

    //empty final need to initialize in constructor
    //otherwise it will not work
    private final String colorSkin;

    public Human(String colorSkin) {
        this.colorSkin = colorSkin;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    //Cannot create setter method, because constant is final
    //    public String setColorSkin(String colorSkin) {
    //        this.colorSkin=colorSkin;
    //    }
}

final class BornHuman{

    public static final void bornHuman(final Human human){
        //Cannot assign new object, because final Human human
//        human = new Human(HumanColors.BLACK_COLOR);
        System.out.println("Human borned with " + human.getColorSkin());
    }
}

public class BlankFinals {
    public static void main(String[] args) {
        BornHuman hospital = new BornHuman();

        Human whiteHuman = new Human(HumanColors.WHITE_COLOR);
        //Call static method through class name
        BornHuman.bornHuman(whiteHuman);

        Human yellowHuman = new Human(HumanColors.YELLOW_COLOR);
        //Call static method through object reference
        hospital.bornHuman(yellowHuman);

    }
}

class A{
    //final method cannot be overrided
    final void someMwthod(){
        System.out.println("inside A");
    }
}

class B extends A{
    //@Override //Method does not override 'A someMethod' in base class
    //final method cannot be overrided
    public void someMethod(){
        System.out.println("inside B");
    }
}