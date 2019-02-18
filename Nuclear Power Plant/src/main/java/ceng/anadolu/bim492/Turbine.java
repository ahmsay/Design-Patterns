package ceng.anadolu.bim492;

class Turbine {
    private static Turbine turbine = new Turbine();
    private Generator generator = Generator.getInstance();
    private int turnSpeed = 0;

    private Turbine() {

    }

    void turn(int pressure) {
        turnSpeed = pressure * 2;
        if (turnSpeed > 200)
            generator.produce(turnSpeed);
    }

    int getTurnSpeed() {
        return turnSpeed;
    }

    static Turbine getInstance() {
        return  turbine;
    }
}
