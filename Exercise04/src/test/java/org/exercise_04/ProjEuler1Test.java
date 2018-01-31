package org.exercise_04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjEuler1Test {

    @Test
    public void TestSumUntil10(){
        ProjEuler1 p = new ProjEuler1();
        assertEquals(23, p.sumMultiplesThreeFive(10));
    }

    @Test
    public void TestSumUntil1000(){
        ProjEuler1 p = new ProjEuler1();
        assertEquals(233168, p.sumMultiplesThreeFive(1000));
    }
}
