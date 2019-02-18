package ceng.anadolu.bim492;

public class F35_Factory extends Factory {
    protected WarPlane createWarplane(Type type) {
        if (type.equals(Type.FIGHTER)) {
            return new F35_Fighter();
        } else if (type.equals(Type.BOMBER)) {
            return new F35_Bomber();
        } else
            return null;
    }
}
