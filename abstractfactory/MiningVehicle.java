package org.example.abstractfactory;

public class MiningVehicle implements Vehicle {
    @Override
    public void operate() {
        System.out.println("Mining Vehicle transports minerals.");
    }
}
