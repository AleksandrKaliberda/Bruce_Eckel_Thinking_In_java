package _09_interfaces._272_adapter.processor;

public class WaveForm {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
} ///:~
