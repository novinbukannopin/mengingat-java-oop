package encapsulation;

public class Vehicle {

    Integer mileage;

    public Vehicle(Integer mileage) {
        this.mileage = mileage;
    }

    public void start() {
        this.mileage += 1;
        System.out.printf("Vehicle sudah berjalan %d km%n", this.mileage);
    }
}
