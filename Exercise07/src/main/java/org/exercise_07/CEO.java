package org.exercise_07;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Employee {

    private List<Secretary> secretaries;
    private List<Manager> managers;
    private List<Developer> developers;

    public CEO(String name, int salary){
        super(name,salary);
        secretaries = new ArrayList<>();
        managers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    @Override
    public String printTask() {
        return "CEO "+ super.getName()+ " tells the vision";
    }

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setSecretaries(Secretary secretary) {
        secretaries.add(secretary);
    }

    public void setManagers(Manager manager) {
        managers.add(manager);
    }

    public void setDevelopers(Developer dev) {
        developers.add(dev);
    }
}