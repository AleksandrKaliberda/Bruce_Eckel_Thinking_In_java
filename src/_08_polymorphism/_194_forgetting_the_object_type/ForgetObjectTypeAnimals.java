package _08_polymorphism._194_forgetting_the_object_type;

import java.util.Arrays;
import java.util.List;

class ForgetObjectTypeAnimals {
    public static void main(String[] args) {

        MusicalSchool musicalSchool = new MusicalSchool();
        List<Animal> listAnimal= Arrays.asList(new Cat(), new Dog());
        //Upcasting
        listAnimal.forEach(animal -> musicalSchool.singSong(animal));

    }
}

class Animal{
    void makeVoice(){
        System.out.println("Animal's voice");
    }
}

class Cat extends Animal{
    void makeVoice(){
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    void makeVoice(){
        System.out.println("Bow wow");
    }
}

class MusicalSchool{

    //It lets shorten amount of code
    void singSong(Animal a){
        a.makeVoice();
    }

    //How it will look like without upcasting
    void singSong(Cat c){
        c.makeVoice();
    }

    //How it will look like without upcasting
    void singSong(Dog d){
        d.makeVoice();
    }
}