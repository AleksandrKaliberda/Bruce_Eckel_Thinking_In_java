package _09_interfaces._283_nested_interfaces;

class A_{

    //Интерфейсы могут вкладываться в классы и в другие интерфейсы.
    interface B{

        //Не обязательно реализовывать вложенные в один интерфейс
        // другие интерфейсы.
        //Избыточное объявление public
        public interface C{public void f();
        }//End interface C

        //Не обязательно реализовывать вложенные в один интерфейс
        // другие интерфейсы.
        interface D{}//End interface D

        //Illegal combination of 'private' & 'public'
        //Все элементы интерфейса, должны быть открытыми
        // (интерфейс Е тоже элемент внутри интерфейса)
        //и его нельзя сделать закрытым (private).
        //private interface E{}//End interface D

    }//End interface B

    //Интерфейсы могут быть объявлены закрытыми "private"
    //Нельзя реализовать private interface, кроме как
    // внутри класса где он был определён
    private interface E{public void foo();}//End interface B

    //Не обязательно реализовывать вложенные в один интерфейс
    // другие интерфейсы
    class F implements B{}

}//End class A

//Cannot resolve symbol E_
//class G implements E_{}

class Main1 {
    public static void main(String[] args) {

    }
}
