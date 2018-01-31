package org.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextMungerTest {

    @Test
    public void TestTextMunger(){
        String text = "Some not really so long text,  that will somehow get shuffled.";
        assertEquals(text.length(),TextMunger.mungerText(text).length());
    }
}
