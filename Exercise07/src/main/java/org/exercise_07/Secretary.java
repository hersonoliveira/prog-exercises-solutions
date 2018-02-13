package org.exercise_07;

public class Secretary extends Employee{

    public Secretary(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String printTask() {
        return "Secretary " + super.getName() + " is ordering stuff";
    }
}
