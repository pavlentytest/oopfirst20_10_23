public class ECar extends Car {
    private double batteryCapacity;

    public ECar(String name, int m, double b) {
        super(name, m);
        batteryCapacity = b;
    }
    public ECar() {
    }

    @Override // аннотация
    // переопределение
    // override
    public void doBeep() {
        System.out.println("ECar beeped!");
    }
    public void doBeep(int a, int b) {

    }
    public void doBeep(int x) {

    }
}
