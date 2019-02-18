package ceng.anadolu.bim492;

public class FlyInChaseMode implements FlyBehavior {
    public void fly(String model) {
        System.out.println("This " + model + " is now flying in chase mode.");
    }
}
