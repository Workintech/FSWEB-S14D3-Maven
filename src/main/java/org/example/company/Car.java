package org.example.company;

public class Car {
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String toString(){
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " -> the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " -> the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + " -> the car is braking");
        return "the car is braking";
    }
}