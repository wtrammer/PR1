package Car;
public class Demo {

	public static void main(String[] args) {

		int n;
		Car porsche911 = new Car();
		porsche911.Brand = "Porsche";
		porsche911.Colour = "Black";
		
		porsche911.setCurrentGear(3);
		System.out.println("Gang: "+porsche911.CurrentGear);
		porsche911.nextGear();
		
	}

}
