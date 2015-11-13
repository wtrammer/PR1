
public class Turm {

	public static void main(String[] args) {
		int number = 2;
		int counter = 2; 
		
		//1. Teil vom Turm: Multiplikationen von 2..9
		while(counter <= 9) {
			//Ausgabe des aktuellen Berechnungsschrittes
			System.out.println(number + " * " + counter
					+ " = " + (number * counter) );
			//Multiplikation und Zuweisung des Results
			//f�r n�chsten Durchlauf, sowie Erh�hung
			//des counters mittels Post-Increment 
			number *= counter++;
		}

		//Variable number beh�lt Wert aus letzten 
		//Durchlauf der oberen while-Schleife
		
		//Zur�cksetzen des counters auf Startwert
		counter = 2;
		
		//2. Teil vom Turm: Divisionen von 2..9
		while(counter <= 9) {
			//Ausgabe des aktuellen Berechnungsschrittes
			System.out.println(number + " / " + counter
					+ " = " + (number / counter) );
			//Division und Zuweisung des Results
			//f�r n�chsten Durchlauf, sowie Erh�hung
			//des counters mittels Post-Increment 
			number /= counter++;
		}

	}

}
