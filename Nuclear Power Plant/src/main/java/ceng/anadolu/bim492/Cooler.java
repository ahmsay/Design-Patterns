package ceng.anadolu.bim492;

class Cooler {
    private Reactor reactor = Reactor.getInstance();

    Cooler() {

    }

    void cool() {
        if (reactor.getTemperature() > 2500)
            reactor.setTemperature(reactor.getTemperature() - 510);
    }
}
