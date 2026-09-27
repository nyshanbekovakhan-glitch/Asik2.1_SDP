package org.example.abstractfactory;

public class MiningHabitat implements Habitat {
    @Override
    public void build() {
        System.out.println("Mining Habitat provides shelter for miners.");
    }
}
