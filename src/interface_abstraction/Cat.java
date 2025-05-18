package interface_abstraction;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
