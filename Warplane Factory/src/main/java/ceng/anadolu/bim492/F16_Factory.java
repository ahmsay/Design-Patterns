package ceng.anadolu.bim492;

public class F16_Factory extends Factory {
    protected WarPlane createWarplane(Type type) {
        if (type.equals(Type.FIGHTER)) {
            return new F16_Fighter();
        } else if (type.equals(Type.BOMBER)) {
            return new F16_Bomber();
        } else
            return null;
    }
}
