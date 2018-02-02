package org.exercise_06;

import java.util.ArrayList;
import java.util.List;

public class RecursionMaxValue {

    /**
     * 1- [] should be a list
     * 2- Recursion to find max value
     *
     */

    public static void main(String[] args){
        String s = "[1,2,[4,45],3]";
        List<String> nums = parseStringToList(s);
        System.out.println(nums.size());
        for(String i:nums){
            System.out.println(">"+i);
        }


    }

    public static List<String> parseStringToList(String s){
        String[] chars = s.split("[^\\d]");
        List<String> nums = new ArrayList<>();

        for(String c:chars){
            if(c.matches("\\d+")){
                nums.add(c);
            }
        }
        return nums;
    }

//    public int findMax(String str){
//        int max;
//        List<String> chars = new ArrayList<String>(Arrays.asList(str.split("")));
//        StringBuilder sbNum = new StringBuilder();
//        Iterator<String> iterator = chars.iterator();
//
//        while(iterator.hasNext()){
//
//        }
//
//        return max;
//    }


}
