package ceng.anadolu.bim492;

public class F16_Bomber extends WarPlane {
    public F16_Bomber() {
        name = "F-16 Bomber";
        setFlyBehavior(new FlySubSonic());
        weaponary.add("Armor Piercing Bomb");
    }
}
