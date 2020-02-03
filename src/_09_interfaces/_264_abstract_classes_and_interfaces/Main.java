package _09_interfaces._264_abstract_classes_and_interfaces;

import _09_interfaces._264_abstract_classes_and_interfaces.robots.Robodog;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List<Animal>animalList=Arrays.asList(
                new Dog("Bobik"),
                new Dog("Spykie"),
                new Cat("Mashka"),
                new Cat("Max"),
                new Robodog("Robo pirate"));

        feedAllAnimals(animalList);

        System.out.println();

        animalList.forEach(Animal::sleep);
    }

    //Polymorphic method that uses a common Animal's interface eat()
    //for all the animals list.
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void feedAllAnimals(List<Animal>animalListToFeed){
        animalListToFeed.forEach(Animal::eat);
    }
}
