public class ECar extends Car {
    private double batteryCapacity;

    public ECar(String name, int m, double b) {
        super(name, m);
        batteryCapacity = b;
    }
    public ECar() {
        super();
    }
}
