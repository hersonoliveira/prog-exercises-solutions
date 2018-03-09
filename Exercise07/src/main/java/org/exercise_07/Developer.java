package org.exercise_07;

public abstract class Developer extends Employee{

    public Developer(String name, int salary) {
        super(name, salary);
    }

    public abstract String develop();
}
