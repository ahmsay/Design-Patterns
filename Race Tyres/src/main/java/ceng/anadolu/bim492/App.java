package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {
        TrackInfo trackInfo = new TrackInfo();
        SoftTyreDisplay soft = new SoftTyreDisplay(trackInfo);
        HardTyreDisplay hard = new HardTyreDisplay(trackInfo);
        WetTyreDisplay wet = new WetTyreDisplay(trackInfo);
        trackInfo.setConditions(0.30, 35, Surface.ASPHALT);
        trackInfo.setConditions(0.20, 5, Surface.DIRT);
        trackInfo.setConditions(0.65, 20, Surface.ASPHALT);
    }
}
