package _09_interfaces._286_interfaces_and_factories.hf._05_factory1;

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
class NYStylePepperoniPizza extends Pizza {}
class ChicagoStylePepperoniPizza extends Pizza {}
class ChilliPizza extends Pizza {}
class NYStyleChilliPizza extends Pizza {}
class ChicagoStyleChilliPizza extends Pizza {}

/*
 * Класс SimplePizzaFactory занимается исключительно
 * созданием объектов пиццы.
 *
 * Фабрика должна быть единственной частью приложения работающего
 * с конкретными классами пиццы.
 *
 * createPizza возвращает ново-созданные объекты pizza.
 *
 * Паттерн Фабричной метод, определяет интерфейс создания объекта, но позволяет субклассам выбрать класс
 * создаваемого экземпляра. Таким образом, Фабричный Метод делегирует операцию создания экземпляра субклассам.
 */
class SimplePizzaFactory {

    //интерфейс создания объекта
    Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza();
        } else if (pizzaType.equals(PizzaType.CHILLI)) {
            pizza = new ChilliPizza();
        }
        return pizza;
    }
}

/*
 * Клиент фабрики.
 * PizzaStore обращается к SimplePizzaFactory для получения экземпляров
 */
abstract class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    //Получает запрашиваемый тип пиццы, и готовит её
    Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza;
        pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(PizzaType pizzaType);
}

//Региональные версии PizzaStore различаются стилем своей пиццы - у нью йоркской пиццы тонкая основа,
// у чикагсской - толстая.
// Мы инкапуслируем все эти различия в методе createPizza(), и сделаем его ответственным за
// создание правильного вида пиццы. Для этого каждому субклассу PizzaStore будет
// разрешено самостоятельно определить свой метод createPizza(). Итак у нас получается группа
// конкретных субклассов PizzaStore со своими разновидностями пиццы, причём все эти классы входят
// в инфраструктуру PizzaStore и продолжают использовать проверенный метод orderPizza().
class NYStylePizzaStore extends PizzaStore {

    public NYStylePizzaStore(SimplePizzaFactory simplePizzaFactory) {
        super(simplePizzaFactory);
    }

    //создаёт свой createPizza, характерный для New York
    @Override
    Pizza createPizza(PizzaType pizzaType) {

        Pizza pizza = new Pizza();

        if (pizzaType == pizzaType.PEPPERONI) {
            pizza = new NYStylePepperoniPizza();
        } else if (pizzaType == pizzaType.CHILLI) {
            pizza = new NYStyleChilliPizza();
        }

        return pizza;
    }
}

class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore(SimplePizzaFactory simplePizzaFactory) {
        super(simplePizzaFactory);
    }

    //создаёт свой createPizza, характерный для Chicago
    @Override
    Pizza createPizza(PizzaType pizzaType) {

        Pizza pizza = new Pizza();

        if (pizzaType == pizzaType.PEPPERONI) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (pizzaType == pizzaType.CHILLI) {
            pizza = new ChicagoStyleChilliPizza();
        }

        return pizza;
    }
}

class Main {
    public static void main(String[] args) {

        PizzaStore pizzaStoreNY = new NYStylePizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStoreNY.orderPizza(PizzaType.PEPPERONI);
        System.out.println(pizza.toString());
    }
}

/*
OUTPUT:
prepare
bake
cut
box
_09_interfaces._286_interfaces_and_factories.hf._05_factory1.NYStylePepperoniPizza@1b6d3586
 */