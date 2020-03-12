package _09_interfaces._286_interfaces_and_factories.hf._03_there_are_even_more_pizza;

/*
* Проблема в том, что выбор конкретного лкасса для создания
* экземпляра усложняет метод orderPizza() и не позволяет закрыть его для изменений.
* А если одни аспекты изменяются, а другие остаются неизменными,
* пора заняться инкапсуляцией. (это раскрывается в _04encapsulate_object_creation)
 */


//These pizza is no more popular, so not needed
//class PepperoniPizza extends Pizza{}
//class ChilliPizza extends Pizza{}

//New Popular pizza
class SaucePizza extends Pizza{}
class TunaPizza extends Pizza{}

enum PizzaType{
    //Not popular pizza, so not needed
    //PEPPERONI, CHILLI

    //New pizza
    SAUCE, TUNA;
}

//Существует много разновидностецй пиццы...
//Поэтому вы добавляете код который определяет нужный вид пиццы, а затем
//переходит к её изготовлению
class Pizza {

    static Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza=new Pizza();

        //Not popular pizza, so not needed
        //if(pizzaType.equals(PizzaType.PEPPERONI)){pizza=new PepperoniPizza();}
        //if(pizzaType.equals(PizzaType.CHILLI)){pizza=new ChilliPizza();}
        //New Popular pizza
        if(pizzaType.equals(PizzaType.SAUCE)){pizza=new SaucePizza();}
        if(pizzaType.equals(PizzaType.TUNA)){pizza=new TunaPizza();}
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    private void prepare(){System.out.println("pizza.prepare");};
    private void bake(){System.out.println("pizza.bake");}
    private void cut(){System.out.println("pizza.cut");}
    private void box(){System.out.println("pizza.box");}

    public static void main(String[] args) {
        //Not popular pizza, so not needed
        //Pizza pizza1 = orderPizza(PizzaType.PEPPERONI);
    }
}