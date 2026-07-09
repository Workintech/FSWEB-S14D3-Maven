package org.example.arge;

public class ElectricCar  extends  CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    public double getAvgKmPerCharge() { return avgKmPerCharge; }
    public int getBatterySize() { return batterySize; }
    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Electric engine is starting silently.");
        return "Electric engine started.";
    }

    @Override
    public String drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " -> Driving. Average km per charge: " + avgKmPerCharge);
        return "Electric car driving.";
    }
}
