package _09_interfaces._286_interfaces_and_factories.hf._01_define_changeable_aspects;

class Pizza {

    static Pizza orderPizza(){
    Pizza pizza = new Pizza();
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
        Pizza pizza1 = orderPizza();
    }
}
