package _09_interfaces._283_initializing_fields_in_interfaces;

interface IntFieldsTest {
    //Поля в интерфейсах не могут быть "пустыми константами", но могут
    // инициализироваться не константными выражениями.
    int VAL_1 = Main.genRandInt();
//    int VAL_0; //NOT OK
}

class Main {

    public static int genRandInt() {
        /* Math.random()
         * Returns a {@code double} value with a positive sign, greater
         * than or equal to {@code 0.0} and less than {@code 1.0}.
         * Returned values are chosen pseudorandomly with (approximately)
         */
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        //Так как поля являются статическими, они инициализируются при первой
        // загрузке класса, которая происходит при первом обращении к любому
        // из полей интерфейса.
        System.out.println(IntFieldsTest.VAL_1);
    }
}