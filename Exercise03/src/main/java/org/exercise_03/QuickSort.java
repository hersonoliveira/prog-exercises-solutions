package org.exercise_03;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        for(String n:args[0].split(" ")){
            nums.add(Integer.parseInt(n));
        }

        sort(nums);
        System.out.println(nums.toString());
    }

    public static void sort(List<Integer> list){
        int num = list.size()-1;
        quickSort(list, 0, num);
    }

    private static void quickSort(List<Integer> list, int begin, int end){
        int left, right;
        left = begin;
        right = end;

        //partition
        int pivot = list.get(begin + (end-begin)/2);

        while(left<=right){
            //find left-side values bigger than pivot
            while(list.get(left)<pivot){
                left++;
            }

            //find right-side values smaller than pivot
            while(list.get(right)>pivot){
                right--;
            }

            if(left<=right){
                int aux = list.get(right);
                list.set(right, list.get(left));
                list.set(left,aux);
                left++;
                right--;
            }
        }

        //left-side array
        if (begin < right){
            quickSort(list, begin, right);
        }
        //right-side array
        if(left < end){
            quickSort(list,left, end);
        }
    }
}