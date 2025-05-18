package inheritance_polymorphism;

public class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name, false);
    }

    @Override
    public void start() {
       System.out.println("Bicycle starts");
    }
}
