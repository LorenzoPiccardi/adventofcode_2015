package main;

import java.util.ArrayList;
import java.util.List;

import days.DayInterface;
import days.Day1;
import days.Day2;
import days.Day3;

public class Main {

	public static void main(String[] args) {

		List<DayInterface> dailyTasks = new ArrayList<>();

		dailyTasks.add(new Day1());
		dailyTasks.add(new Day2());
		dailyTasks.add(new Day3());

		dailyTasks.forEach(d -> d.run());

	}

}