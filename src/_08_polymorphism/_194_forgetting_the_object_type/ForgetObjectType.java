package _08_polymorphism._194_forgetting_the_object_type;

class ForgetObjectType {
    public static void main(String[] args) {

    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Brass frenchHorn = new Brass();

    Music2.tune(flute); // No upcasting
    Music2.tune(violin);
    Music2.tune(frenchHorn);

    //OUTPUT:
    //Wind.play() MIDDLE_C
    //Stringed.play() MIDDLE_C
    //Brass.play() MIDDLE_C
    }
}

//: polymorphism/music/Note.java
// Notes to play on musical instruments.
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
} ///:~

//: polymorphism/music/Instrument.java
class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}
///:~

//: polymorphism/music/Wind.java
// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
} ///:~

//: polymorphism/music/Music2.java
// Overloading instead of upcasting.
class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}

class Music2 {

    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }
}