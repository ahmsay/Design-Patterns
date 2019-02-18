package ceng.anadolu.bim492;

public class WetTyreDisplay implements Observer{
    private double humidity;
    private double temperature;
    private Surface surface;
    private Subject trackInfo;
    private double performance;

    public WetTyreDisplay(Subject trackInfo) {
        this.trackInfo = trackInfo;
        trackInfo.registerObserver(this);
    }

    public void update(double humidity, double temperature, Surface surface) {
        performance = 3;
        double x = humidity * 5;
        double y = temperature / 25;
        double z = surface.getFriction() * 2;
        performance = performance + x + y + z;
        display();
    }

    public void display() {
        System.out.println("Performance value for Wet tyre: " + performance);
    }
}
