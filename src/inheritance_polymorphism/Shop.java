package inheritance_polymorphism;

public class Shop {
    Vehicle product;

    public Shop(Vehicle product) {
        this.product = product;
    }

    public void display() {
        System.out.println(product.toString());
    }
}
