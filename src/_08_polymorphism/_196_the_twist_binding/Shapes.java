package _08_polymorphism._196_the_twist_binding;

import java.util.Random;

class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {

        Shape[] shapes = new Shape[12];
        // Fill up the array with shapes:
        for(int i = 0; i < shapes.length; i++) {
            //Upcasting
            shapes[i] = Shapes.gen.next();
            shapes[i].shapeName();
        }
        /*
        Позднее связывание это механизм определения фактического типа объекта во время
        работы программы для вызова подходящего метода. Иначе говоря, компилатор не
        знает типа объекта, но механизм вызова методов определяет его и вызывает
        соответствующее тело метода.
        Для всех методов Java используется механизм позднего связывания, если только
        метод не был объявлен как final.
         */
        // Make polymorphic method calls:
        for(Shape shape : shapes)
            shape.draw();
    }

    /*
    OUTPUT 1:
    Triangle.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Circle.draw()
     */

    /*
    OUTPUT 2:
    I am Triangle
    I am Square
    I am Triangle
    I am Circle
    I am Circle
    I am Triangle
    I am Circle
    I am Square
    I am Triangle
    I am Triangle
    I am Square
    I am Rectangle
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Circle.draw()
    Circle.draw()
    Triangle.draw()
    Circle.draw()
    Square.draw()
    Triangle.draw()
    Triangle.draw()
    Square.draw()
    Rectangle.draw()
     */
}

class Shape {
    void draw() {}
    void erase() {}

    /*
    HOME WORK
    Exercise 3: (1) Add a new method in the base class of Shapes.java that prints a
    message, but don’t override it in the derived classes. Explain what happens. Now override it
    in one of the derived classes but not the others, and see what happens. Finally, override it in
    all the derived classes.

    If not override shapeName() method in another classes, 'I am Shape' will be written in whenever
    the method will be called.
    */
    void shapeName(){
        System.out.println("I am Shape");
    }
} ///:~

//: polymorphism/shape/Circle.java
class Circle extends Shape {
    @Override
    void draw() { System.out.println("Circle.draw()"); }
    @Override
    void erase() { System.out.println("Circle.erase()"); }

    /*
    HOME WORK
    If override the shapeName() method in only one class, 'I am Circle' will be written in whenever
    the method will be called.
     */
    @Override
    void shapeName(){
        System.out.println("I am Circle");
    }
} ///:~

class Square extends Shape {
    @Override
    void draw() { System.out.println("Square.draw()"); }
    @Override
    void erase() { System.out.println("Square.erase()"); }
    /*
    HOME WORK
    If override the shapeName() method in only one class, 'I am Square' will be written in whenever
    the method will be called.
     */
    @Override
    void shapeName(){
        System.out.println("I am Square");
    }
} ///:~

//: polymorphism/shape/Triangle.java
class Triangle extends Shape {
    @Override
    void draw() { System.out.println("Triangle.draw()"); }
    @Override
    void erase() { System.out.println("Triangle.erase()"); }
    /*
    HOME WORK
    If override the shapeName() method in only one class, 'I am Triangle' will be written in whenever
    the method will be called.
     */
    @Override
    void shapeName(){
        System.out.println("I am Triangle");
    }
} ///:~

    /*
    HOME WORK
    Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( ) that
    polymorphism works for your new type as it does in the old types
     */
//: polymorphism/shape/Triangle.java
    class Rectangle extends Shape {
        @Override
        void draw() { System.out.println("Rectangle.draw()"); }
        @Override
        void erase() { System.out.println("Rectangle.erase()"); }
        /*
        HOME WORK
        If override the shapeName() method in only one class, 'I am Rectangle' will be written in whenever
        the method will be called.
         */
        @Override
        void shapeName(){
            System.out.println("I am Rectangle");
        }
    } ///:~

//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
class RandomShapeGenerator {
    private Random rand = new Random(47);
    Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
} ///:~