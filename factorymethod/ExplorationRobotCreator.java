package org.example.factorymethod;

public class ExplorationRobotCreator extends RobotCreator {
    @Override
    public Robot createRobot() {
        return new ExplorationRobot();
    }
}