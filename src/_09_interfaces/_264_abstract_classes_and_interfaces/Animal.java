package _09_interfaces._264_abstract_classes_and_interfaces;

public abstract class Animal implements SleepBehavior {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //Method eat() is common interface for all the classes derived from Animal
    protected void eat(){
        System.out.print("likes ");
    };

    public void sleep(){
        System.out.println("Animal " + name + " is sleeping");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    //Dog override abstract class method eat(), as it is common interface
    //for al derived classes from Animal
    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " likes pedigree");
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    //Cat override abstract class method eat(), as it is common interface
    //for al derived classes from Animal.
    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " likes wiskas");
    }
}
