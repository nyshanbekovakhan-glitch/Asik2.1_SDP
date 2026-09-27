package org.example.factorymethod;

public abstract class RobotCreator {
    public abstract Robot createRobot();
    public void startMission() {
        Robot robot = createRobot();
        robot.performTask();
    }
}
