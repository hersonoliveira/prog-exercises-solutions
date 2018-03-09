package org.exercise_07;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private List<Secretary> secretaries;
    private List<Developer> developers;

    public Manager(String name, int salary) {
        super(name, salary);
        secretaries = new ArrayList<>();
        developers = new ArrayList<>();
    }

    @Override
    public String printTask() {
        return "Manager " + super.getName()+ " tells the directions";
    }

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setSecretaries(Secretary secretary) {
        secretaries.add(secretary);
    }

    public void setDevelopers(Developer dev) {
        developers.add(dev);
    }
}