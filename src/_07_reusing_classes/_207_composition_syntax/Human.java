package _07_reusing_classes._207_composition_syntax;

class Human {

    // Initializing at point of definition
    //Clothes
    String outerwear = "shirt";
    String pants = "black";
    String headwear;
    String shoes;
    int gloves;

    //Body info
    float temperature;

    //Documents
    private Passport passport;

    Human(){
        System.out.println("In Human constructor");
        headwear = "grey cap";
        temperature = 36.7f;
        passport = new Passport();
    }

    // Instance initialization:
    {gloves = 2;}

    @Override
    public String toString() {

        // Delayed initialization:
        /*
        Right before you actually need to use the object. This is often called lazy
        initialization. It can reduce overhead in situations where object creation
        is expensive and the object doesn’t need to be created every time.
         */
        if(shoes== null) shoes = "puma";

        return "Human{" +
                "outerwear='" + outerwear + '\'' +
                ", pant='" + pants + '\'' +
                ", headwear='" + headwear + '\'' +
                ", shoes='" + shoes + '\'' +
                ", gloves=" + gloves +
                ", temperature=" + temperature +
                ", passport=" + passport +
                '}';
    }
}

class Passport{
    String name;
    int age;

    Passport(){
        System.out.println("in Passport() constructor");
        // Constructor initialization with composition.
        age = 36;
        name = "Alex";
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Human sasha = new Human();
        System.out.println(sasha);
    }
    /*
    OUTPUT:
    In Human constructor
    in Passport() constructor
    Human{
    outerwear='shirt',
    pant='black',
    headwear='grey cap',
    shoes='puma',
    gloves=2,
    temperature=36.7,
    passport=Passport{name='Alex', age=36}}
     */
}
