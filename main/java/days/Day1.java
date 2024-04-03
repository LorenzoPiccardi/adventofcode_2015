package days;

import java.util.OptionalInt;

import utils.FileReader;

public class Day1 extends DayBase {

	public Day1() {
		this.dayNumber = 1;
	}

	public static int getTargetFloor(final String input) {

		int floor = 0;
		for (char c : input.toCharArray()) {

			if (c == '(') {
				floor++;
			} else if (c == ')') {
				floor--;
			}
		}

		return floor;
	}

	public static OptionalInt getBasementIndex(final String input) {

		int floor = 0;
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			if (c == '(') {
				floor++;
			} else if (c == ')') {
				floor--;
			}

			if (floor == -1) {
				return OptionalInt.of(i + 1);
			}

		}

		return OptionalInt.empty();
	}

	@Override
	public void run() {

		printDay();
		final String inputDay1 = FileReader.readFile("day1_input.txt");
		System.out.println(String.format("Target floor: %d", Day1.getTargetFloor(inputDay1)));

		final OptionalInt basementIndex = Day1.getBasementIndex(inputDay1);
		if (basementIndex.isPresent()) {
			System.out.println(String.format("Basement index: %d", basementIndex.getAsInt()));
		} else {
			System.out.println(String.format("Santa doesn't go to the basement"));
		}

		System.out.println("\n");
	}
}
