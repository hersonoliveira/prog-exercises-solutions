package org.exercise_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionMaxValue {

    public static void main(String[] args){
        List<Integer> x = parseStringToList(args[0]);

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
        return max(findMax(list,length-1), list.get(length-1));
    }

    public static int max(int a, int b){
        return a>b?a:b;
    }
}