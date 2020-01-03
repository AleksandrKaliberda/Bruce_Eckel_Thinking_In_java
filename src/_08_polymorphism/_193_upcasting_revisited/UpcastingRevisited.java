package _08_polymorphism._193_upcasting_revisited;

class UpcastingRevisited {
    public static void main(String[] args) {

        Wind flute = new Wind();
        Music.tune(flute); // Upcasting
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

//: polymorphism/music/Music.java
// Inheritance & upcasting.
class Music {
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
}