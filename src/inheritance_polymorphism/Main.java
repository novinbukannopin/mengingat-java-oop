package inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Volvo", false);
        System.out.println(car);
        car.start();
        car.openDoor();

        Vehicle vehicle = new Vehicle("Supra", true);
        System.out.println(vehicle);
        vehicle.start();

        Bicycle bicycle = new Bicycle("Honda");
        System.out.println(bicycle);
        bicycle.start();

        Shop shop = new Shop(car);
        shop.display();
    }
}
