package _09_interfaces._272_adapter.processor;

class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    public String name() { return filter.name(); }
    public WaveForm process(Object input) {
        return filter.process((WaveForm)input);
    }
}
