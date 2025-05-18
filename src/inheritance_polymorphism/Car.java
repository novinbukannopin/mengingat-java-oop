package inheritance_polymorphism;

public class Car extends Vehicle {

    public Car(String name, boolean hasGas) {
        super(name, hasGas);
    }

    public void openDoor(){
        System.out.println("Open door");
    }
}
