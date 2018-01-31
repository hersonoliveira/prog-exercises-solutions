package org.exercise_03;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortTest {

    private static int NUM = 12;
    private static int MAX = 20;
    private List<Integer> nums;

    @Before
    public void prepare(){
        nums = new ArrayList<>();
        Random generator = new Random();
        for(int i=0; i<NUM;i++){
            nums.add(generator.nextInt(MAX));
        }
    }

    @Test
    public void testQuickSort(){
        QuickSort q = new QuickSort();
        q.sort(nums);
        assertTrue(validate(nums));
    }

    private boolean validate(List<Integer> nums){
        int last = nums.get(0);
        for(int i:nums){
            if(last>i){
                return false;
            }
            last = i;
        }
        return true;
    }
}
