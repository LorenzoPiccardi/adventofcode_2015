package days;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import days.Day2;

public class Day2Test {
	
	
	@Test
    public void testTotalWrapper() {
		
		final Day2 day2 = new Day2();
	
		assertEquals(day2.getTotalWrappingPaperArea("2x3x4"), 58);
		assertEquals(day2.getTotalWrappingPaperArea("1x1x10"), 43);
		
    }
	
	@Test
    public void testTotalRibbon() {
		
		final Day2 day2 = new Day2();
       
		assertEquals(day2.getTotalRibbonLenght("2x3x4"), 34);
		assertEquals(day2.getTotalRibbonLenght("1x1x10"), 14);
		assertEquals(day2.getTotalRibbonLenght("1x1x10\n1x1x10\n2x3x4"), 62);
		assertEquals(day2.getTotalRibbonLenght("10x20x30"), 6060);
		assertEquals(day2.getTotalRibbonLenght("1x1x1"), 5);
		
    }

}
