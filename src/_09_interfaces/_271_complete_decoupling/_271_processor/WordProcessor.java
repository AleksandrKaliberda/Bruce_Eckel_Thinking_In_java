package _09_interfaces._271_complete_decoupling._271_processor;

    /*
    Решение при котором поведение метода изменяется в зависимости от
    переданного объекта аргумента, называется паттерном "Стратегия"
    Метод содержит фиксированную часть алгоритма, а объект
    переменную часть. Под "объектом стратегии" понимается передаваемый
    код, который содержит выполняемый код. В данном случае объект
    Processor является объектом стратегии, а в методе main() мы видим
    две разные стратегии применяемые к String s.
     */

class Processor{

    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}

//Behavior class that converts string sentence to uppercase (AB CD EFG)
class Upcase extends Processor{
    @Override
    String process(Object input){
        // Covariant return
        return ((String)input).toUpperCase();
    }
}

//Behavior class that converts string sentence to downcase (ab cd efg)
class Downcase extends Processor{
    @Override
    String process(Object input){
        // Covariant return
        return ((String)input).toLowerCase();
    }
}

//Class that gets any kind of process, shows given class feature
class Apply{
    static void process(Processor p, Object s){
        System.out.println("Use of processor " + p.name());
        System.out.println(p.process(s));
    }

}

//Strategy pattern
class WordProcessor {

    public static void main(String[] args) {
        String s = "The More You Learn, The More You Earn";

        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
    }

}
    /*
    OUTPUT:
    Use of processor Upcase
    THE MORE YOU LEARN, THE MORE YOU EARN
    Use of processor Downcase
    the more you learn, the more you earn
     */