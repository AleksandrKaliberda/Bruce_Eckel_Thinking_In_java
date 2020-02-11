package _09_interfaces._272_adapter.duck;

import java.util.Arrays;
import java.util.List;

interface Duck{
    void quack();
}

class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}

class Turkey{
    void gobble(){
        System.out.println("gobble gobble");
    }
}

//Adapter
//Код TurkeyAdapter Получает имеющийся интерфейс от Duck и приводит интерфейс к тому виду
//на который расчитан клиент. Т.е. функционал индюшки упакован внутри метода quack().
class TurkeyAdapter extends Turkey implements Duck{
    @Override
    public void quack() {
        super.gobble();
    }
}

 class Main {
     public static void main(String[] args) {
         Duck mallardDuck = new MallardDuck();
         Duck turkey = new TurkeyAdapter();

         List<Duck>duckList = Arrays.asList(mallardDuck,turkey);
         duckList.forEach(Duck::quack);
     }
}
