package ceng.anadolu.bim492;

public class FlySubSonic implements FlyBehavior {
    public void fly(String model) {
        System.out.println("This " + model + " is now flying subsonic.");
    }
}
