package encapsulation;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(100);
        car.start();

        Vehicle truck = new Vehicle(200);
        truck.start();
    }
}
