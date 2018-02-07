package org.exercise_07;

import java.util.List;

public class Manager extends Employee{

    private List<Secretary> secretaries;
    private List<Developer> developers;

    public Manager(String name, int salary, List<Secretary> secretaries, List<Developer> developers) {
        super(name, salary);
        this.secretaries = secretaries;
        this.developers = developers;
    }

    public String tellDirections(String directions){
        return "Manager " + super.getName()+ " tells:" +directions;
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
