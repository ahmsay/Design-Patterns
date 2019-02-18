package ceng.anadolu.bim492;

public class F16_Fighter extends WarPlane {
    public F16_Fighter() {
        name = "F-16 Fighter";
        setFlyBehavior(new FlySuperSonic());
        weaponary.add("Machine Gun");
    }
}
