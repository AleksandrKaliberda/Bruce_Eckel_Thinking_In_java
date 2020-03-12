package _09_interfaces._286_interfaces_and_factories.hf._02_there_is_many_pizzas;

class PepperoniPizza extends Pizza{}
class ChilliPizza extends Pizza{}
enum PizzaType{PEPPERONI, CHILLI;}

//Существует много разновидностецй пиццы...
//Поэтому вы добавляете код который определяет нужный вид пиццы, а затем
//переходит к её изготовлению
class Pizza {

    static Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza=new Pizza();
        if(pizzaType.equals(PizzaType.PEPPERONI)){pizza=new PepperoniPizza();}
        if(pizzaType.equals(PizzaType.CHILLI)){pizza=new ChilliPizza();}
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
        Pizza pizza1 = orderPizza(PizzaType.PEPPERONI);
    }
}