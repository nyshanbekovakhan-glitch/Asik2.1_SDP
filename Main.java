package org.example;

import org.example.factorymethod.ExplorationRobotCreator;
import org.example.factorymethod.MedicalRobotCreator;
import org.example.factorymethod.MiningRobotCreator;
import org.example.factorymethod.RobotCreator;
import org.example.abstractfactory.ColonyClient;
import org.example.abstractfactory.ColonyFactory;
import org.example.abstractfactory.MiningColonyFactory;

public class Main {

    public static void main(String[] args) {

        RobotCreator miningCreator = new MiningRobotCreator();
        RobotCreator medicalCreator = new MedicalRobotCreator();
        RobotCreator explorationCreator = new ExplorationRobotCreator();

        miningCreator.startMission();
        medicalCreator.startMission();
        explorationCreator.startMission();

        ColonyFactory colonyFactory = new MiningColonyFactory();
        ColonyClient colonyClient = new ColonyClient(colonyFactory);
        colonyClient.prepareColony();
    }
}
