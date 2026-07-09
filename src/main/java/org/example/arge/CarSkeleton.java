package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine() {
        System.out.println("The generic engine is starting.");
        return "The generic engine is starting.";
    }
    public String drive() {
        runEngine();
        System.out.println("The generic car is driving.");
        return "The generic car is driving.";
    }

    protected void runEngine() {
        System.out.println("The generic engine is running.");
    }
}
