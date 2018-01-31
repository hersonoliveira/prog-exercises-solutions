import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz(){
        assertEquals("4 buzz fizz 7", FizzBuzz.convertToFizzBuzz(4,7));
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz", FizzBuzz.convertToFizzBuzz(1,10));
        assertEquals("fizz 4 buzz fizz 7 8", FizzBuzz.convertToFizzBuzz(3,8));
    }
}
