

public class Car {
		
		public int CurrentGear;
		public int CurrentSpeed;
		public String Colour;
		public String Brand;
		public int Year;
		public String Colour;
		
	public void NextGear()
	{
		CurrentGear++;
	}
	
	public void setCurrentGear (int newGear) 
	{
		CurrentGear = newGear;
	}
	
	public void accelerate()
	{
		CurrentSpeed += 10;
	}
	
	public void accelerate(int customSpeed)
	{
		CurrentSpeed += customSpeed;
	}		
}