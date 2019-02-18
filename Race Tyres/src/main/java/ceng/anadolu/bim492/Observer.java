package ceng.anadolu.bim492;

public interface Observer {
    void update(double humidity, double temperature, Surface surface);
    void display();
}
