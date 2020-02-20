package _09_interfaces._283_initializing_fields_in_interfaces;

import java.util.Random;

interface RandVals {

    //Поля в интерфейсах не могут быть "пустыми константами", но могут инициализироваться
    //не константными выражениями.
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
} ///:~

class TestRandVals {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}
/* Output:
8
-32032247016559954
-8.5939291E18
5.779976127815049
*///:~