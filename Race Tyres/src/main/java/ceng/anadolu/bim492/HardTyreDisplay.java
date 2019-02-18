package ceng.anadolu.bim492;

public class HardTyreDisplay implements Observer{
    private double humidity;
    private double temperature;
    private Surface surface;
    private Subject trackInfo;
    private double performance;

    public HardTyreDisplay(Subject trackInfo) {
        this.trackInfo = trackInfo;
        trackInfo.registerObserver(this);
    }

    public void update(double humidity, double temperature, Surface surface) {
        performance = 5;
        double x = humidity * 3;
        double y = temperature / 35;
        double z = surface.getFriction() * 4;
        performance = performance - x + y + z;
        display();
    }

    public void display() {
        System.out.println("Performance value for Hard tyre: " + performance);
    }
}
