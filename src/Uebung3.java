
public class Uebung3 {
	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
		
		
		boolean resultA = isCapital && inhabitants > 100_000;
		
		double totalTaxes = inhabitants * taxPerPersonAndMonth * 12;
		
		boolean resultB = inhabitants > 200_000 && totalTaxes > 720_000_000;
		
		return resultA || resultB;
			
	}

	public static void main(String[] args) {
		
		boolean isCapital = true;
		int inhabitants = 250_000;
		double taxPerPersonAndMonth = 430.0;
		
		boolean result = isMetropolis(isCapital, inhabitants, taxPerPersonAndMonth);
		System.out.println("Metropolis? " + result);
			
	}

}
