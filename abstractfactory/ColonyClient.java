package org.example.abstractfactory;

public class ColonyClient {
    private final ColonyFactory factory;
    public ColonyClient(ColonyFactory factory) {
        this.factory = factory;
    }
    public void prepareColony() {
        Robot robot = factory.createRobot();
        Habitat habitat = factory.createHabitat();
        Vehicle vehicle = factory.createVehicle();

        robot.performTask();
        habitat.build();
        vehicle.operate();
    }
}
