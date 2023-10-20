
public class Car {
    private String name;
    private int maxspeed;

    public String getName() {

        return name;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setName(String name) {
        // проверки
        this.name = name;
    }

    public void setMaxspeed(int maxspeed) {
        // проверки
        this.maxspeed = maxspeed;
    }

    public Car(String name, int m) {
        this.name = name;
        this.maxspeed = m;
    }
    public Car() {
        //name = "123123";
    }

    public void doBeep() {
        System.out.println("Car beeped!");
    }

    // метод перегружен
    // overload
    public void doBeep(String message) {
        System.out.println(message);
    }

    public void doBeep(int a) {
        System.out.println("a="+a);
    }
}
