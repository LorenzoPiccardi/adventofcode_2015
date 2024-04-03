package days;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import days.Day1;

public class Day1Test {

	
	@Test
    public void testTagetFloor() {
       
		final String input1 = "(())";
		final String input2 = "()()";
		final String input3 = "(()(()(";

        assertEquals(Day1.getTargetFloor(input1), 0);
        assertEquals(Day1.getTargetFloor(input2), 0);
        assertEquals(Day1.getTargetFloor(input3), 3);
		
    }
	
	@Test
    public void testBasementIndex() {
       
		final String input1 = ")";
		final String input2 = "()())";

        assertEquals(Day1.getBasementIndex(input1).getAsInt(), 1);
        assertEquals(Day1.getBasementIndex(input2).getAsInt(), 5);
		
    }
	
}
