package Auto;

public class Demo {

	public static void main(String[] args) {

		int n;
		Car porsche911 = new Car();
		porsche911.brand = "Porsche";
		porsche911.colour = "black";
		porsche911.year = 1979;
		
		
		Car golf5 = new Car();
		golf5.brand = "VW";
		golf5.colour = "White";
		golf5.year = 2012;
		
		Car audia4 = new Car();
		audia4.brand = "Audi";
		audia4.colour = "White";
		audia4.year = 2011;
		audia4.PS = 170;
		
		
		audia4.setCurrentGear(1);
		audia4.accelerate(130);
		audia4.accelerate(15);
		System.out.println("Aktueller Gang Audi: "+audia4.currentGear);
		System.out.println("Speed:" +audia4.currentSpeed);
		System.out.println(audia4.PS+"PS");
		
		
		
		porsche911.setCurrentGear(3);
		System.out.println("aktueller gang Porsche: " +porsche911.currentGear);
		
		golf5.setCurrentGear(3);
		System.out.println("aktueller gang - golf5: " +golf5.currentGear);
		System.out.println("aktueller gang - porsche: " +porsche911.currentGear);
		
		porsche911.nextGear();
		System.out.println("aktueller gang: " + porsche911.currentGear);

		
		porsche911.accelerate();
		System.out.println("speed: " + porsche911.currentSpeed);
		
		porsche911.accelerate(15);
		System.out.println("speed: " + porsche911.currentSpeed);
		
		porsche911.accelerate();
		System.out.println("speed: " + porsche911.currentSpeed);
		
		
		
		
		

	}

}
