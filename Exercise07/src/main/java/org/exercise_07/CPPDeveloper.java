package org.exercise_07;

public class CPPDeveloper extends Employee implements Developer {

    public CPPDeveloper(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String develop() {
        return "Coding C++";
    }
}
