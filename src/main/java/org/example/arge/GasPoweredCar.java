package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private  int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getCylinders() { return cylinders; }
    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Gas engine is igniting with " + cylinders + " cylinders.");
        return "Gas engine started.";
    }

    @Override
    public String drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " -> Driving. Average km per litre: " + avgKmPerLitre);
        return "Gas car driving.";
    }

}
