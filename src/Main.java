

public class Main {

    public static void main(String[] args) {
        // Объекты класса или экземпляры
        Car toyota = new Car(); // объект класса Car
        toyota.setName("Toyota");
        toyota.setMaxspeed(200);


        System.out.println(toyota.getName());
        System.out.println(toyota.getMaxspeed());

        Car skoda = new Car("Skoda",250);
        System.out.println(skoda.getName());
        System.out.println(skoda.getMaxspeed());

        Car fiat = new Car();
        Car car = new Car();

       // Main main = new Main();


    }
}