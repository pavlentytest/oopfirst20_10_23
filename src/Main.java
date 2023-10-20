

public class Main {

    public static void main(String[] args) {
        // Объекты класса или экземпляры
        Car toyota = new Car(); // объект класса Car
        toyota.name = "Toyota";
        toyota.maxspeed = 200;
        System.out.println(toyota.name);
        System.out.println(toyota.maxspeed);

        Car skoda = new Car("Skoda",250);
        System.out.println(skoda.maxspeed);
        System.out.println(skoda.name);

        Car fiat = new Car();
        Car car = new Car();

       // Main main = new Main();


    }
}