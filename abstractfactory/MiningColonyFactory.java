package org.example.abstractfactory;

public class MiningColonyFactory implements ColonyFactory {
    @Override
    public Robot createRobot() {
        return new MiningRobot();
    }
    @Override
    public Habitat createHabitat() {
        return new MiningHabitat();
    }
    @Override
    public Vehicle createVehicle() {
        return new MiningVehicle();
    }
}