package days;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import days.Day2;

public class Day3Test {

	@Test
	public void testNumberOfHusesWithPresentsBySanta() {

		final Day3 day3 = new Day3();

		assertEquals(day3.getNumberOfHusesWithPresentsBySanta(">"), 2);
		assertEquals(day3.getNumberOfHusesWithPresentsBySanta("^>v<"), 4);
		assertEquals(day3.getNumberOfHusesWithPresentsBySanta("^v^v^v^v^v"), 2);

	}

	@Test
	public void testNumberOfHusesWithPresentsBySantaAndRoboSanta() {

		final Day3 day3 = new Day3();

		assertEquals(day3.getNumberOfHusesWithPresentsBySantaAndRoboSanta("^v"), 3);
		assertEquals(day3.getNumberOfHusesWithPresentsBySantaAndRoboSanta("^>v<"), 3);
		assertEquals(day3.getNumberOfHusesWithPresentsBySantaAndRoboSanta("^v^v^v^v^v"), 11);
		
	}

}
