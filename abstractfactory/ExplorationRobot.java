package org.example.abstractfactory;

public class ExplorationRobot implements Robot {
    @Override
    public void performTask() {
        System.out.println("Exploration Robot explores the Martian surface.");
    }
}