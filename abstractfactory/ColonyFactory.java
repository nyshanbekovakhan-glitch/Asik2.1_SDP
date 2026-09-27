package org.example.abstractfactory;

public interface ColonyFactory {
    Robot createRobot();
    Habitat createHabitat();
    Vehicle createVehicle();
}