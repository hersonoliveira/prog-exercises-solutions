package org.exercise_07;

public class Secretary extends Employee{

    public Secretary(String name, int salary) {
        super(name, salary);
    }

    public String orderStuff(){
        return "Secretary " + super.getName() + " is ordering stuff";
    }
}
