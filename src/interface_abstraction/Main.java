package interface_abstraction;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Tom");
        cat.eat();
        cat.call();

        Chicken chicken = new Chicken("Chick");
        chicken.eat();
        chicken.call();

        MySecurity security = new MySecurity();

        if (security.verifyUser("admin", "abc")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        SecurityFilter(security);
    }

    public static void SecurityFilter(SecurityStandard securityStandard) {
        System.out.println("Security filter applied.");
    }
}
