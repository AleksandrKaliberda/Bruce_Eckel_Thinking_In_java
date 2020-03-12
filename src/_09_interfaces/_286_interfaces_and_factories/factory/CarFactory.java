package _09_interfaces._286_interfaces_and_factories.factory;

interface CarFactory { Car createCar();}
interface Car{void move();}

class Lanos implements Car{
    @Override
    public void move() {
        System.out.println("Lanos moves");
    }
}
class LanosFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Lanos();
    }
}

class Reanult implements Car{
    @Override
    public void move() {
        System.out.println("Reanult moves");
    }
}
class ReanultFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Reanult();
    }
}

class Cars{

    public static void seatAndGo(CarFactory carFactory){
        Car car = carFactory.createCar();
        car.move();
    }

    public static void main(String[] args) {
        seatAndGo(new LanosFactory());
        seatAndGo(new ReanultFactory());
    }
}