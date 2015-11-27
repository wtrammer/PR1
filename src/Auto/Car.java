package Auto;

public class Car {

	public int currentGear;
	public int currentSpeed;
	public String colour;
	public String brand;
	public int year;
	
	public void nextGear()
	{
		currentGear++;
	}
	
	public void setCurrentGear(int CurrentGear)
	{
		this.currentGear = CurrentGear;
	}
	
	public void accelerate(int customSpeed)
	{
		currentSpeed += customSpeed;
	}
	
	public void accelerate()
	{
		int defaultIncrement = 10;
		currentSpeed += defaultIncrement;
	}
	
}
