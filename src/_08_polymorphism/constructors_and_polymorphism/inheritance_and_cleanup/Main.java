package _08_polymorphism.constructors_and_polymorphism.inheritance_and_cleanup;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye");
        frog.dispose();

        /*
        OUTPUT:

        Create Characteristic is alive
        Create Description Basic living Creature
        LivingCreature()
        Create Characteristic can live in water
        Create Description Both water and land
        Amphibian()
        Create Characteristic Croaks
        Create Description Eat Bugs
        Frog()
        Bye
        Frog dispose
        Disposing Description Eat Bugs
        Disposing Characteristic Croaks
        Amphibian dispose
        Disposing Description Both water and land
        Disposing Characteristic can live in water
        LivingCreature dispose
        Disposing Description Basic living Creature
        Disposing Characteristic is alive
         */
    }
}

class Characteristic{
    private String characteristic;

    Characteristic(String characteristic) {
        this.characteristic = characteristic;
        System.out.println("Create Characteristic " + characteristic);
    }

    protected void dispose(){
        System.out.println("Disposing Characteristic " + characteristic);
    }
}

class Description{
    private String description;

    Description(String description) {
        this.description = description;
        System.out.println("Create Description " + description);
    }

    protected void dispose(){
        System.out.println("Disposing Description " + description);
    }

}

class LivingCreature{
    private Characteristic characteristic = new Characteristic("is alive");
    private Description description = new Description("Basic living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("LivingCreature dispose");
        description.dispose();
        characteristic.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic characteristic = new Characteristic("has heart");
    private Description description = new Description("Animal not vegetable");

    public Animal() {
        System.out.println("Animal()");
    }

    protected void dispose(){
        System.out.println("Animal dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Amphibian extends LivingCreature{
    private Characteristic characteristic = new Characteristic("can live in water");
    private Description description = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose(){
        System.out.println("Amphibian dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Frog extends Amphibian{
    private Characteristic characteristic = new Characteristic("Croaks");
    private Description description = new Description("Eat Bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose(){
        System.out.println("Frog dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}