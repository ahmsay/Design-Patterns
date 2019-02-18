package ceng.anadolu.bim492;

class Controller {
    private Reactor reactor;
    private Cooler cooler;
    private Turbine turbine;
    private Generator generator;

    Controller(Reactor reactor, Cooler cooler, Turbine turbine, Generator generator) {
        this.reactor = reactor;
        this.cooler = cooler;
        this.turbine = turbine;
        this.generator = generator;
    }

    void test() {
        System.out.println("The test is started.\n");
        for (int i=0; i<10; i++) {
            reactor.fission();
            cooler.cool();
            System.out.println("Temperature: " + reactor.getTemperature() + " C\t\tPressure: " + reactor.getPressure() + " bar\t\tTurn Speed: " + turbine.getTurnSpeed() + " rpm\t\t Produced electricity: " + generator.getElectricity() + " MW");
        }

        if (generator.getElectricity() > 3200)
            System.out.println("\nThe reactor runs successfully.");
        else
            System.out.println("\nThe reactor is not efficient for some reasons.");
        System.out.println("\nShutting down the system.");
    }
}
