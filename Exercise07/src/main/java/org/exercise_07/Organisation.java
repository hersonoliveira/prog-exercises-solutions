package org.exercise_07;

import java.util.ArrayList;
import java.util.List;

public class Organisation {

    private String name;
    private CEO ceo;
    private List<Employee> employees;
    private List<Manager> managers;
    private List<Secretary> secretaries;
    private List<JavaDeveloper> javaDevelopers;
    private List<CPPDeveloper> cppDevelopers;

    public Organisation(String name) {
        this.name = name;
        employees = new ArrayList<>();
        managers = new ArrayList<>();
        secretaries = new ArrayList<>();
        javaDevelopers = new ArrayList<>();
        cppDevelopers = new ArrayList<>();
    }

    public void generateOrg(){
        //1-Generate all employee
        ceo = new CEO(generateRandomName(),generateRandomInteger(30000,50000));
        employees.add(ceo);
        for(int i=0;i<generateRandomInteger(1,2);i++){
            Secretary s = new Secretary(generateRandomName(),generateRandomInteger(2000,5000));
            secretaries.add(s);
            employees.add(s);
        }
        for(int i=0;i<generateRandomInteger(1,10);i++){
            Manager m = new Manager(generateRandomName(),generateRandomInteger(15000,20000));
            managers.add(m);
            employees.add(m);
        }
        for(int i=0;i<generateRandomInteger(1,4);i++){
            JavaDeveloper jd = new JavaDeveloper(generateRandomName(),generateRandomInteger(7000,13000));
            javaDevelopers.add(jd);
            employees.add(jd);
        }
        for(int i=0;i<generateRandomInteger(1,5);i++){
            CPPDeveloper cd = new CPPDeveloper(generateRandomName(),generateRandomInteger(7000,13000));
            cppDevelopers.add(cd);
            employees.add(cd);
        }
        //TODO relations
    }

    public String printManpowerCosts(){
        int total=0;
        for(Employee e:employees){
            total+=e.getSalary();
        }
        return this.name + " - Total salary cost: USD " + total;
    }

    public void printPersonalTasks(){
        for(Employee e:employees){
            System.out.println(e.printTask());
        }
    }

    public void printManagerChain(){
        //TODO
    }


    private static int generateRandomInteger(int min, int max){
        return (int)(Math.random() * ((max-min) +1))+min;
    }

    private static String generateRandomName(){
        String[] names = {"Paul","John", "Robert", "Ana", "Julia", "Mary"};
        return names[generateRandomInteger(0,names.length-1)];
    }
}
