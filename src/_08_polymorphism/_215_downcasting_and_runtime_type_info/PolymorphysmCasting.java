package _08_polymorphism._215_downcasting_and_runtime_type_info;

class PolymorphysmCasting {
    public static void main(String[] args) {

        //БОЛЬШЕЕ ЦЕЛОЕ ЛОЖИМ В МЕНЬШЕЕ ЦЕЛОЕ
        byte byteBox1 = 0;
        short shortBox1 = 200;

        /*
        Если есть необходимость положить «значение из большего контейнера в
        меньший», нужно быть осторожным, и пользоваться явным приведением типов.

        Здесь будет скрытая ошибка, т.к. большое число было присвоено типу
        который не может содержать настолько большое значение.
         */
        byteBox1 = (byte)shortBox1;
        System.out.println(byteBox1);//OUTPUT -56

        //ЦЕЛОЕ В ДРОБНОЕ
        int intBox = 2147483647;
        float floatBox = intBox;            // от типа int к типу float
        System.out.println(floatBox);


        //ОДНО ЦЕЛОВЕ ЧИСЛО, ВТОРОЕ С ПЛАВАЮЩЕЙ ТОЧКОЙ
        System.out.println("если один из операндов операции относится к типу double, то и второй операнд преобразуется к типу double");
        int intBox1 = 3;
        double doubleBox1 = 4.6;
        //если один из операндов операции относится к типу double, то и второй операнд преобразуется к типу double
        double doubleBox2 = intBox1 + doubleBox1;
        System.out.println(doubleBox2);


        //БУКВЫ В ЦИФРЫ
        System.out.println("Если в операциях участвуют данные типа char, то они преобразуются в int");
        //Если в операциях участвуют данные типа char, то они преобразуются в int:
        int intBox2 = 'a' + 5;
        System.out.println(intBox2);  // 102


        //ДРОБНЫЕ ЧИСЛА В ЦЕЛЫЕ
        System.out.println("При преобразовании значений с плавающей точкой к целочисленным значениям, происходит усечение дробной части:");
        double a = 56.9898;
        int b = (int)a;
        //Здесь значение числа b будет равно 56

    }
}
