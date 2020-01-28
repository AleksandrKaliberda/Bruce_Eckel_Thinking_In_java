package _07_reusing_classes._225_upcasting;

class Human{
    String name;

    public Human(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println("Eat");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}

class European extends Human{

    public European(String name) {
        super(name);
    }

    @Override
    void eat(){
        System.out.println("Eat by spoon");
    }

    @Override
    public String toString() {
        return "European{" +
                "name='" + super.name + '\'' +
                '}';
    }
}

class Asian extends Human{

    public Asian(String name) {
        super(name);
    }

    @Override
    void eat(){
        System.out.println("Eat by chopsticks");
    }

    @Override
    public String toString() {
        return "Asian{" +
                "name='" + super.name + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        //Upcasting
        Human european = new European("Arnold");
        System.out.println(european.toString());

        //Upcasting
        diningRoom(european);

        //Upcasting. methods will be not available.
        Object obj01 = european;
        System.out.println("Inside Object type: " + obj01.toString());
        Human european01 = (European)obj01;
        System.out.println("Object converted to European type: " + european01.toString()+"\n");




        //Upcasting
        Human asian = new Asian("Hu");
        System.out.println(asian.toString());

        //Upcasting
        diningRoom(asian);

        Object obj02 = asian;
        System.out.println("Inside Object type: " + obj02.toString());
    }

    //Upcasting
    static void diningRoom(Human h){
        h.eat();
    }
}
