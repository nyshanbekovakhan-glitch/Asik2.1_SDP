package org.example.abstractfactory;

public class ResearchVehicle implements Vehicle {
    @Override
    public void operate() {
        System.out.println("Research Vehicle collects scientific samples.");
    }
}
