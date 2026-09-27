package org.example.factorymethod;

public class MiningRobotCreator extends RobotCreator {
    @Override
    public Robot createRobot() {
        return new MiningRobot();
    }
}
