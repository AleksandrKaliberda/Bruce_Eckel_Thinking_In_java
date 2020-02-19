package _09_interfaces._280_adapting_to_an_interface;
import java.nio.*;
import java.util.*;

//: interfaces/RandomWords.java
// Implementing an interface to conform to a method.
public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) { this.count = count; }

     // Attempts to read characters into the specified character buffer.
     // The buffer is used as a repository of characters as-is
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1; // Indicates end of input

        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Number of characters appended
    }

    public static void main(String[] args) {
        //Create RandomWords object and pass amount of chars
        Scanner s = new Scanner(new RandomWords(10));
        while(s.hasNext())
            System.out.println(s.next());
    }
}
    /*OUTPUT:
    Yazeruyac
    Fowenucor
    Goeazimom
    Raeuuacio
    Nuoadesiw
    Hageaikux
    Ruqicibui
    Numasetih
    Kuuuuozog
    Waqizeyoy
     */
