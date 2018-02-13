package org.exercise_07;

public class Main {

    public static void main(String[] args){

        Organisation org = new Organisation("ETH");
        org.generateOrg();
        System.out.println(org.printManpowerCosts());
        org.printPersonalTasks();



    }


}
