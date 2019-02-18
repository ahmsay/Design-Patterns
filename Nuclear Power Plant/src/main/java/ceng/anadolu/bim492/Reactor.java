package ceng.anadolu.bim492;

class Reactor {
    private static Reactor reactor = new Reactor();
    private Turbine turbine = Turbine.getInstance();
    private int temperature = 0;
    private int pressure = 0;

    private Reactor () {

    }

    int getTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    int getPressure() {
        return pressure;
    }

    void fission() {
        int temp = (int)(490 + Math.random() * 10);
        temperature += temp;
        pressure = temperature / 5;
        if (pressure > 200) {
            releaseSteam();
        }
    }

    private void releaseSteam() {
        int released = pressure/5;
        pressure -= released;
        turbine.turn(released);
    }

    static Reactor getInstance() {
        return reactor;
    }
}
