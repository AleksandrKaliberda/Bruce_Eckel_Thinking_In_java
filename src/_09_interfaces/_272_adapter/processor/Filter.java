package _09_interfaces._272_adapter.processor;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public WaveForm process(WaveForm input){return input;}

    public static void main(String[] args) {

//        Filter lowPass = new LowPass(1.4);
//        System.out.println(lowPass.name());
//        System.out.println(lowPass.process(new WaveForm()));

        FilterAdapter filterAdapter = new FilterAdapter(new LowPass(3));
        System.out.println(filterAdapter.process(new WaveForm()));
//        System.out.println(filterAdapter.name());
//        System.out.println(filterAdapter.process(new WaveForm()));
//        System.out.println(filterAdapter.process(new LowPass(3)));

    }
} ///:~
