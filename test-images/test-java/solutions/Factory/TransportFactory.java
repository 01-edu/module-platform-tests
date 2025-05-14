public class TransportFactory {
    public static Transport getTransport(String type) {
        if (type.equals("Car")) {
            return new Car();
        } else if (type.equals("Plane")) {
            return new Plane();
        }
        throw new IllegalArgumentException("Invalid type: " + type);
    }
}