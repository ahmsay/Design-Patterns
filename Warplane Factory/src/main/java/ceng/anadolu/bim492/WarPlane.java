package ceng.anadolu.bim492;

import java.util.ArrayList;

public class WarPlane {
    String name;
    private FlyBehavior flyBehavior;
    ArrayList<String> weaponary = new ArrayList<>();

    public void performFly() {
        flyBehavior.fly(name);
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
}
