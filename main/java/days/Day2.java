package days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.FileReader;

public class Day2 extends DayBase {

	private final List<Box> boxList;

	private class Box {

		private int l, w, h;
		private int lw, wh, hl;

		public Box(final String sizes) {

			String[] intSize = sizes.split("x");

			this.l = Integer.parseInt(intSize[0]);
			this.w = Integer.parseInt(intSize[1]);
			this.h = Integer.parseInt(intSize[2]);

			this.lw = l * w;
			this.wh = w * h;
			this.hl = h * l;

		}

		public int getL() {
			return l;
		}

		public int getW() {
			return w;
		}

		public int getH() {
			return h;
		}

		public int getHl() {
			return hl;
		}

		public int getLw() {
			return lw;
		}

		public int getWh() {
			return wh;
		}

	}

	public Day2() {
		this.dayNumber = 2;
		this.boxList = new ArrayList<>();
	}

	public int getTotalWrappingPaperArea(final String input) {
		this.boxList.clear();
		Arrays.stream(input.split("\\n")).forEach(b -> boxList.add(new Box(b)));
		return boxList.stream().mapToInt(box -> getPaperWrapperArea(box)).sum();
	}

	public int getPaperWrapperArea(final Box box) {
		return 2 * (box.getHl() + box.getWh() + box.getLw()) + getMinArea(box);
	}

	public int getMinArea(final Box box) {
		return Math.min(box.getHl(), Math.min(box.getLw(), box.getWh()));
	}

	public int getTotalRibbonLenght(final String input) {
		this.boxList.clear();
		Arrays.stream(input.split("\\n")).forEach(b -> boxList.add(new Box(b)));
		return boxList.stream().mapToInt(box -> getRibbonLenght(box)).sum();
	}

	public int getRibbonLenght(final Box box) {
		return box.getH() * box.getW() * box.getL() + getBow(box);
	}

	public int getBow(final Box box) {
		return 2 * (box.getH() + box.getL() + box.getW() - Math.max(box.getH(), Math.max(box.getW(), box.getL())));
	}

	@Override
	public void run() {

		printDay();
		final String input = FileReader.readFile("day2_input.txt");

		final Day2 day2 = new Day2();
		final int totalWrappingPaperArea = day2.getTotalWrappingPaperArea(input);
		System.out.println(String.format("Total Wrapping Paper Area: %d", totalWrappingPaperArea));

		final int totalRibbonLenght = day2.getTotalRibbonLenght(input);
		System.out.println(String.format("Total Ribbon Lenght: %d", totalRibbonLenght));

		System.out.println("\n");
		
	}
}
