package _10_inner_classes._290_inner_class_creation.exmpl3;

class Parcel {

    class Destination {
        String to;
        String from;

        public Destination(String to, String from) {
            this.to = to;
            this.from = from;
        }

        public Destination() {
        }

        @Override
        public String toString() {
            return "Destination{" +
                    "to='" + to + '\'' +
                    ", from='" + from + '\'' +
                    '}';
        }
    }

    class Content {
        String value;

        public Content(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Content{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    Destination getDestination(String to, String from) {
        return new Destination(to, from);
    }

    Content getContent(String value) {
        return new Content(value);
    }

    void ship(String value, String to, String from){
        Content c = getContent(value);
        Destination d = getDestination(to, from);
        System.out.println(c);
        System.out.println(d);
    }
}

class Main {
    public static void main(String[] args) {

        Parcel parcelFromUAtoJP = new Parcel();
        parcelFromUAtoJP.ship("chocolate","Japan", "Ukraine");

        //Call inner class
        Parcel p = new Parcel();
        Parcel.Content c = p.getContent("candies");
        Parcel.Destination d = p.getDestination("Australia", "Ukraine");
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
}
