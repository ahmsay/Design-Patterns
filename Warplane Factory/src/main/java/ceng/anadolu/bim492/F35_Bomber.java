package ceng.anadolu.bim492;

public class F35_Bomber extends WarPlane {
    public F35_Bomber() {
        name = "F-35 Bomber";
        setFlyBehavior(new FlySubSonic());
        weaponary.add("Chemical Bomb");
    }
}
