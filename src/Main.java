

public class Main {

    public static void main(String[] args) {
        // Объекты класса или экземпляры
        Car toyota = new Car(); // объект класса Car
        toyota.setName("Toyota");
        toyota.setMaxspeed(200);
        toyota.doBeep();
        toyota.doBeep("Message beeped!");

        System.out.println(toyota.getName());
        System.out.println(toyota.getMaxspeed());

        Car skoda = new Car("Skoda",250);
        System.out.println(skoda.getName());
        System.out.println(skoda.getMaxspeed());

        Car fiat = new Car();
        Car car = new Car();

       // Main main = new Main();

        ECar tesla = new ECar("Tesla",400,500);
        tesla.setName("Tesla");
        tesla.setMaxspeed(300);
        Car tesla2 = new ECar();
        tesla2.doBeep();
        Car electrobus = new Electrobus();
        electrobus.doBeep();

        //Math.round()


        /*
        Предметная область - которая нравится:
        1) Выбрать три или четыре сущности
        (сущность - это автомобиль, Car - описание сущности в виде класса)
        2) Создать на основе сущностей - классы
           с полями(от 3х полей(св-в)
        3) Создать переопределение (1 или 2)
        4) Создать перегрузку (1 или 2)
        5) Создать наследование (1 или 2)
        6) Создать экзепляры классов (от 3х)

         */

    }
}