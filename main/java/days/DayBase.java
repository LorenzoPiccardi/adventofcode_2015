package days;

public abstract class DayBase implements DayInterface {
	

	protected int dayNumber;
	
	public void printDay() {
    	System.out.println(String.format("DAY %d", dayNumber));
	}

}
