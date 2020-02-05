package _09_interfaces._267_interfaces;

import _09_interfaces._267_interfaces.behavior.*;
import _09_interfaces._267_interfaces.human.Asian;
import _09_interfaces._267_interfaces.human.European;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        European sasha = new European("Sasha");
        European zhenya = new European("Zhenya");
        Asian kaori = new Asian("Kaori");

        //Set 'Go by walk' behavior
        sasha.setGoBehavior(null);
        sasha.setGoBehavior(new GoByWalk());

        //Set 'Go by car' behavior
        zhenya.setGoBehavior(new GoByCar());

        //Set 'Go by car' behavior
        kaori.setGoBehavior(new GoByCar());

        List<HumanBehavior> humanBehaviorList =Arrays.asList(sasha,zhenya,kaori);
        goWalkTogether(humanBehaviorList);

        sasha.setEatBehavior(new EatByChopsticks());
        zhenya.setEatBehavior(new EatBySpoon());
        kaori.setEatBehavior(new EatByChopsticks());

        eatTogether(humanBehaviorList);

        /*
        OUTPUT:
        Please set go behavior first
        Sasha go by walk STATIC FINAL TEST
        Zhenya go by car STATIC FINAL TEST
        Kaori go by car STATIC FINAL TEST
        Sasha eat by chopsticks
        Zhenya eat by spoon
        Kaori eat by chopsticks
         */
    }

    //Работа метода не зависит от фактического типа объекта,
    //поэтому типы, добавленные в систему, будут работать правильно.

    //Неважно проводите ли вы преобразование к обычному классу с именем Human,
    //абстрактному классу с именем Human или интерфейсу с именем Human,
    //действие будет одинаковым.
    static void goWalkTogether(List<HumanBehavior> humanBehavior){
        humanBehavior.forEach(HumanBehavior::go);
    }

    //Работа метода не зависит от фактического типа объекта,
    //поэтому типы, добавленные в систему, будут работать правильно.

    //Неважно проводите ли вы преобразование к обычному классу с именем Human,
    //абстрактному классу с именем Human или интерфейсу с именем Human,
    //действие будет одинаковым.
    static void eatTogether(List<HumanBehavior> humanBehavior){
        humanBehavior.forEach(HumanBehavior::eat);
    }
}

