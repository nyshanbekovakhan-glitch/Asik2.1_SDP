package org.example.factorymethod;

public class MedicalRobotCreator extends RobotCreator {
    @Override
    public Robot createRobot() {
        return new MedicalRobot();
    }
}
