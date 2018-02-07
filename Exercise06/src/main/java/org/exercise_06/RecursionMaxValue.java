package org.exercise_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionMaxValue {

    /**
     * 1- [] should be a list
     * 2- Recursion to find max value
     *
     */

    public static void main(String[] args){
        String s = "[1,2,4,5,[66,9],33]";
        List<Integer> x = parseStringToList(s);
        for(int i:x){
            System.out.println(i);
        }

        System.out.println(findMax(x,x.size()));


    }

    public static List<Integer> parseStringToList(String s){
        String[] chars = s.split("[^\\d]");
        List<String> strList = new ArrayList<>(Arrays.asList(chars));
        List<Integer> nums = new ArrayList<>();

        for(String i:strList){
            if(i.matches("\\d+")){
                nums.add(Integer.parseInt(i));
            }

        }
        return nums;
    }

    public static int findMax(List<Integer> list, int length){
        if(length==1){
            return list.get(0);
        }

//        return max(findMax(list,length-1), list.get(length-1));

        int a=list.get(length),b=list.get();
        return findMax(list,length-1)> list.get(length-1)? list.get(length-2):list.get(length-1);
    }

    public static int max(int a, int b){
        return a>b?a:b;
    }
}
