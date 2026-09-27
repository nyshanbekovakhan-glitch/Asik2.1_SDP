package org.example.factorymethod;

public class MedicalRobot implements Robot {
    @Override
    public void performTask() {
        System.out.println("Medical Robot helps injured colonists.");
    }
}
