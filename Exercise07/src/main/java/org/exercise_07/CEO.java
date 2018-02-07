package org.exercise_07;

import java.util.List;

public class CEO extends Employee {

    private List<Secretary> secretaries;
    private List<Manager> managers;
    private List<Developer> developers;

    public CEO(String name, int salary){
        super(name,salary);
    }

    public CEO(String name, int salary, List<Secretary> secretaries, List<Manager> managers, List<Developer> developers) {
        this(name,salary);
        this.secretaries = secretaries;
        this.managers = managers;
        this.developers = developers;
    }

    public String tellVision(String vision){
        return "CEO "+ super.getName()+ " vision:" + vision;
    }

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public List<Manager> getManagers() {
        return managers;

    }

    public void setSecretaries(List<Secretary> secretaries) {
        this.secretaries = secretaries;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
