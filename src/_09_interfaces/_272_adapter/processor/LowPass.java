package _09_interfaces._272_adapter.processor;

public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public WaveForm process(WaveForm input) {
        return input; // Dummy processing
    }
} ///:~
