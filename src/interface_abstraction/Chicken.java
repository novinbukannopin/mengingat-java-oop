package interface_abstraction;

public class Chicken extends Animal{

    public Chicken(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Chicken eats");
    }
}
