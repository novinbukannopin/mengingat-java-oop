package interface_abstraction;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void call() {
        System.out.printf("Calling %s\n", name);
    }

    public abstract void eat();
}
