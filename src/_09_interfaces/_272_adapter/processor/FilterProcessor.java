package _09_interfaces._272_adapter.processor;

public class FilterProcessor {
    public static void main(String[] args) {
        WaveForm w = new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
//        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
//        Apply.process(
//                new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
