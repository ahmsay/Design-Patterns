package ceng.anadolu.bim492;

public class F35_Fighter extends WarPlane {
    public F35_Fighter() {
        name = "F-35 Fighter";
        setFlyBehavior(new FlyInChaseMode());
        weaponary.add("Missile");
    }
}
