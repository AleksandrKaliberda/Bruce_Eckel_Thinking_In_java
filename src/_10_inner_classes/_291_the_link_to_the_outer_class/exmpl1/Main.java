package _10_inner_classes._291_the_link_to_the_outer_class.exmpl1;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.
interface Selector {
    boolean end();
    Object current();
    void next();
}


class Sequence {

    private Object[] items;
    private int next = 0;

    //Конструктор Создаёт массив объектов по принятому
    //значению его длины
    public Sequence(int size) {
        items = new Object[size];
    }

    // Добавляет новый объект в следующий елемент массива,
    // если не превышен массив объектов
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    //Возвращает новый объект SequenceSelector
    public Selector getNewSelectorObject() {
        return new SequenceSelector();
    }

    //Внутренний класс
    private class SequenceSelector implements Selector {
        private int i = 0;
        //Работа с private элементами внешнего класса
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            //Добавить значение в следующий элемент массива
            sequence.add(Integer.toString(i));
        }
        //Получить новый объект
        Selector selector = sequence.getNewSelectorObject();
        //Пока i != длине массива объектов
        while (!selector.end()) {
            //вернуть текущий элемент i
            System.out.print(selector.current() + " ");
            //увелечить i на один
            selector.next();
        }
    }
}/* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
