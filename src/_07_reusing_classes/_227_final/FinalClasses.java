package _07_reusing_classes._227_final;

class Animal{

    public Animal(Head head) {
    }

    //if inner class will be final, it cannot be extended
    //static final class Head{
    static class Head{
        int size;
        public Head(final int size) {
            this.size = size;
        }
    }

}

//We can extend Animal.Head, because it is not final
class Further extends Animal.Head{
    public Further(int size) {
        super(size);
    }
}

public class FinalClasses {

    public static void main(String[] args) {

        Animal dog = new Animal(new Animal.Head(4));
        Animal parrot = new Animal(new Animal.Head(10));

    }
}
