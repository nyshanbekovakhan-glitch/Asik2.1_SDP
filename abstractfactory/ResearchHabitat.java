package org.example.abstractfactory;

public class ResearchHabitat implements Habitat {
    @Override
    public void build() {
        System.out.println("Research Habitat supports scientific experiments.");
    }
}
