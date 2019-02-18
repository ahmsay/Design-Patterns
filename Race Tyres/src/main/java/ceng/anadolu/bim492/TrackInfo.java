package ceng.anadolu.bim492;

import java.util.ArrayList;

public class TrackInfo implements Subject{
    private ArrayList observers;
    private double humidity;
    private double temperature;
    Surface surface;

    public TrackInfo() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i=0; i<observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(humidity, temperature, surface);
        }
    }

    public void setConditions(double humidity, double temperature, Surface surface) {
        System.out.println("--- Track conditions ---");
        System.out.println("Humidity: %" + (int)(humidity*100) + ", Temperature: " + temperature + " C, Surface: " + surface);
        this.humidity = humidity;
        this.temperature = temperature;
        this.surface = surface;
        notifyObservers();
    }
}
