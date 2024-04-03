package days;

import java.util.HashSet;
import java.util.Set;

import utils.FileReader;

public class Day3 extends DayBase {

	/*
	 * Î y | | x <------o------> | | v
	 *
	 */

	private Set<String> coordinates;

	private class Deliver {

		private int x;
		private int y;

		public Deliver() {
			this.x = 0;
			this.y = 0;
		}

		public void deliver(final char direction, final Set<String> coordinates) {

			switch (direction) {
			case '^':
				y++;
				break;
			case '>':
				x++;
				break;
			case 'v':
				y--;
				break;
			case '<':
				x--;
				break;

			default:
				System.out.println("No direction found");
				break;
			}

			coordinates.add(String.format(coordinateFormat, x, y));
		}

	}

	private String coordinateFormat = "%d:%d";

	public Day3() {
		this.dayNumber = 3;
		this.coordinates = new HashSet<>();
	}

	private void clearCoordinates() {
		this.coordinates.clear();
		this.coordinates.add(String.format(coordinateFormat, 0, 0));
	}

	public int getNumberOfHusesWithPresentsBySanta(final String path) {

		clearCoordinates();

		final Deliver santa = new Deliver();

		path.chars().forEach(direction -> santa.deliver((char) direction, coordinates));

		return coordinates.size();
	}

	public int getNumberOfHusesWithPresentsBySantaAndRoboSanta(final String path) {

		clearCoordinates();

		final Deliver santa = new Deliver();
		final Deliver roboSanta = new Deliver();

		for (int i = 0; i < path.length(); i++) {
			if (i % 2 == 0) {
				santa.deliver(path.charAt(i), coordinates);
			} else {
				roboSanta.deliver(path.charAt(i), coordinates);
			}
		}

		return coordinates.size();
	}

	@Override
	public void run() {

		printDay();
		final String input = FileReader.readFile("day3_input.txt");

		final Day3 day3 = new Day3();
		final int numberOfHusesWithPresentsBySanta = day3.getNumberOfHusesWithPresentsBySanta(input);
		System.out.println(
				String.format("Total number of Huses With Presents by Santa: %d", numberOfHusesWithPresentsBySanta));

		final int numberOfHusesWithPresentsBySantaAndRoboSanta = day3
				.getNumberOfHusesWithPresentsBySantaAndRoboSanta(input);
		System.out.println(String.format("Total number of Huses With Presents by Santa and Robo: %d",
				numberOfHusesWithPresentsBySantaAndRoboSanta));

		System.out.println("\n");

	}

}
