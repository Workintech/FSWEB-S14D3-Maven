package org.example.arge;

public class HybridCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize() { return batterySize; }
    public int getCylinders() { return cylinders; }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Hybrid engine is switching on.");
        return "Hybrid engine started.";
    }

    @Override
    public String drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " -> Driving using both gas and electricity.");
        return "Hybrid car driving.";
    }
}
