package _09_interfaces._286_interfaces_and_factories.hf._04_encapsulate_object_creation;

/* Код создания объекта следует исключить из метода orderPizza.
Мы переместим его в другй объект, единственной задачей которого
будет создание объектов пиццы

Таким образом переменные аспекты отеделны от неизменных
*/

enum PizzaType {PEPPERONI, CHILLI;}

/*
* Продукт производимый фабриков пицца
* Абстрактный класс с полезными реализациями которые могут
* переопределяться в субклассах
*/
class Pizza {

//    static Pizza orderPizza() {
//        Pizza pizza = new Pizza();
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//    }

    void prepare() {
        System.out.println("prepare");
    }
    void bake() {
        System.out.println("bake");
    }
    void cut() {
        System.out.println("cut");
    }
    void box() {
        System.out.println("box");
    }
}

/*
* Конкретные продукты. Каждый продукт должен реализовать интерфейс Pizza,
* и быть конкретным. Если эти условия выполняются, фабрика создаёт экземпляр
* и возвращает его клиенту.
 */
class PepperoniPizza extends Pizza {}
class ChilliPizza extends Pizza {}

/*
 * Класс SimplePizzaFactory занимается исключительно
 * созданием объектов пиццы
 * Фабрика должна быть единственной частью приложения работающего
 * с конкретными классами пиццы
 */
class SimplePizzaFactory {

    Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza();
        }else if (pizzaType.equals(PizzaType.CHILLI)) {
            pizza = new ChilliPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

/*
 * Клиент фабрики.
 * PizzaStore обращается к SimplePizzaFactory для получения экземпляров
 */
class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(pizzaType);
        return pizza;
    }
}

class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
//        SimplePizzaFactory simplePizzaFactory = ;
//        Pizza pizza = simplePizzaFactory.orderPizza(PizzaType.PEPPERONI);
        pizzaStore.orderPizza(PizzaType.PEPPERONI);
    }
}
