package _08_polymorphism.parametric_polymorphism;

class Main {

    public static void main(String args[]) {

        WalkAnimal walkAnimal = new WalkAnimal();

        Holder4<Animal>holder4_1=new Holder4<>();
        Holder4<Animal>holder4_2=new Holder4<>();

        Holder4[]animalArr = new Holder4[2];

        animalArr[0]=holder4_1;
        animalArr[1]=holder4_2;

        animalArr[0].settObj(new Dog());
        animalArr[1].settObj(new Cat());

        walkAnimal.walk(animalArr);
    }
}

class Animal{
    void go(){}
}

class Dog extends Animal{
    void go(){
        System.out.println("Dog walk");
    }
}

class Cat extends Animal{
    void go(){
        System.out.println("Cat walk");
    }
}

class WalkAnimal{

    void walk(Holder4[]arr){

        for (Holder4 h : arr){
            if(h.gettObj() instanceof Dog) {
                ((Dog) h.gettObj()).go();
            }else ((Cat)h.gettObj()).go();
        }

    }

}

class Holder4<T>{
    T tObj;

    public T gettObj() {
        return tObj;
    }

    public void settObj(T tObj) {
        this.tObj = tObj;
    }
}