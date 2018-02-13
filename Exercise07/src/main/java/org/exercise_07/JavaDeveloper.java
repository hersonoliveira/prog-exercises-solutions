package org.exercise_07;

public class JavaDeveloper extends Employee implements Developer{

    public JavaDeveloper(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String printTask() {
        return develop();
    }

    @Override
    public String develop() {
        return "Developer " + super.getName() + " is coding Java";
    }
}
