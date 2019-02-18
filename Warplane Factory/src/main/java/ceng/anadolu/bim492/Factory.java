package ceng.anadolu.bim492;

public abstract class Factory {
    public WarPlane requestWarplane(Type type) {
        WarPlane warPlane = createWarplane(type);
        build(warPlane);
        loadWeapons(warPlane);
        System.out.println(warPlane.name + " is built.\n");
        return warPlane;
    }

    private void build(WarPlane warplane) {
        System.out.println("Getting resources for " + warplane.name + "...");
        System.out.println("Assembling hardware system...");
        System.out.println("Installing software system...");
    }

    private void loadWeapons(WarPlane warPlane) {
        if (warPlane.weaponary.size() > 0) {
            System.out.println("Loading weapons:");
            for (int i = 0; i < warPlane.weaponary.size(); i++){
                System.out.println(" - " + warPlane.weaponary.get(i));
            }
        }
    }

    protected abstract WarPlane createWarplane(Type type);
}
