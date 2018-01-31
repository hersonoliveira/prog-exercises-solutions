package org.exercise_04;

public class ProjEuler1 {

    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        System.out.println(sumMultiplesThreeFive(num));
    }

    public static int sumMultiplesThreeFive(int num){
        int sum=0;
        for(int i=1; i<num;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}