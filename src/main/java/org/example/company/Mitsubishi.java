package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
@Override
    public  String startEngine() {
    System.out.println(getClass().getSimpleName() + "-> Mitsubishi's engine is starting");
return "Mitsubishi's engine is starting";
    }
    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " -> Mitsubishi is accelerating");
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " -> Mitsubishi is braking");
        return "Mitsubishi is braking";
    }

}