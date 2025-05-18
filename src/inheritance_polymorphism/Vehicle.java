package inheritance_polymorphism;

public class Vehicle {
    String name;
    boolean hasGas;

    public Vehicle(String name, boolean hasGas) {
        this.name = name;
        this.hasGas = hasGas;
    }

    public boolean isHasGas() {
        return this.hasGas;
    }

    public void start() {
        if(isHasGas()) {
            System.out.println("Vehicle already has gas");
        } else {
            System.out.println("Vehicle can't start with gas");
        }
    }
}
