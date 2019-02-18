package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {
        Reactor reactor = Reactor.getInstance();
        Cooler cooler = new Cooler();
        Turbine turbine = Turbine.getInstance();
        Generator generator = Generator.getInstance();

        Controller controller = new Controller(reactor, cooler, turbine, generator);
        controller.test();
    }
}
