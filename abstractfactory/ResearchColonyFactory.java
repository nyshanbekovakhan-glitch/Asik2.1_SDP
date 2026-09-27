package org.example.abstractfactory;

public class ResearchColonyFactory implements ColonyFactory {
    @Override
    public Robot createRobot() {
        return new ExplorationRobot();
    }
    @Override
    public Habitat createHabitat() {
        return new ResearchHabitat();
    }
    @Override
    public Vehicle createVehicle() {
        return new ResearchVehicle();
    }
}