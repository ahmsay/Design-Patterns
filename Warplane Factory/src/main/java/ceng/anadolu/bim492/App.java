package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {
        Factory f16factory = new F16_Factory();
        Factory f35factory = new F35_Factory();
        WarPlane plane1 = f16factory.requestWarplane(Type.FIGHTER);
        WarPlane plane2 = f16factory.requestWarplane(Type.BOMBER);
        WarPlane plane3 = f35factory.requestWarplane(Type.FIGHTER);
        WarPlane plane4 = f35factory.requestWarplane(Type.BOMBER);
        plane1.performFly();
        plane2.performFly();
        plane3.performFly();
        plane4.performFly();
        plane4.setFlyBehavior(new FlySuperSonic());
        plane4.performFly();
    }
}
