package org.exercise_07;

import java.util.List;

public class Manager extends Employee{

    private List<Secretary> secretaries;
    private List<Developer> developers;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public Manager(String name, int salary, List<Secretary> secretaries, List<Developer> developers) {
        this(name, salary);
        this.secretaries = secretaries;
        this.developers = developers;
    }

    @Override
    public String printTask() {
        return "Manager " + super.getName()+ " tells the directions";
    }

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public void setSecretaries(List<Secretary> secretaries) {
        this.secretaries = secretaries;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
