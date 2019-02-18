package ceng.anadolu.bim492;

public class SoftTyreDisplay implements Observer{
    private double humidity;
    private double temperature;
    private Surface surface;
    private Subject trackInfo;
    private double performance;

    public SoftTyreDisplay(Subject trackInfo) {
        this.trackInfo = trackInfo;
        trackInfo.registerObserver(this);
    }

    public void update(double humidity, double temperature, Surface surface) {
        performance = 5;
        double x = humidity * 2;
        double y = temperature / 20;
        double z = surface.getFriction() * 3;
        performance = performance - x + y + z;
        display();
    }

    public void display() {
        System.out.println("Performance value for Soft tyre: " + performance);
    }
}
