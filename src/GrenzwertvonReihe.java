
public class GrenzwertvonReihe {

	public static void main(String[] args) {

	
		
	
		
	}
	
	public static double berechneGrenzwert(double genauigkeit) {
		
		double vWert = 0;
		double aWert = 0;
		
		for (int n = 1;;n=n*2)
		{
				if (aWert - vWert < genauigkeit)
				{
					break;
				}
			vWert = aWert;
		}
		
		
		
		return vWert;
		
		
	}
	
	

}
