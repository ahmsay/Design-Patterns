package ceng.anadolu.bim492;

 class Generator {
    private static Generator generator = new Generator();
    private int electricity = 0;

    private Generator() {

    }

    void produce(int turnRate) {
        electricity += turnRate * 3;
    }

    int getElectricity() {
        return electricity;
    }

    static Generator getInstance() {
        return generator;
    }
}
