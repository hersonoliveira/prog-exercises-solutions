package org.exercise_06;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RecursionMaxValueTest {

    private String s;
    private List<Integer> nums;

    @Before
    public void testParseString(){
        s = "[1,3,[4,5,[7,1]],1,[10,1]]";
        nums = RecursionMaxValue.parseStringToList(s);
    }

    @Test
    public void findMaxValue(){
        assertEquals(10,RecursionMaxValue.findMax(nums, nums.size()));

    }
}
