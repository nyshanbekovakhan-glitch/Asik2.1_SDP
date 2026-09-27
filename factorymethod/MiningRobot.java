package org.example.factorymethod;

public class MiningRobot implements Robot {
    @Override
    public void performTask() {
        System.out.println("Mining Robot extracts minerals on Mars.");
    }
}