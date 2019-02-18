package ceng.anadolu.bim492;

public enum Surface {
    CONCRETE(0.75), ASPHALT(0.65), DIRT(0.85);
    private final double value;

    private Surface(double value) {
        this.value = value;
    }

    public double getFriction() {
        return value;
    }
}
