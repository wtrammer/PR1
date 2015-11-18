
public class GrenzwertvonReihe {

	public static double berechneGrenzwert(double genauigkeit) {
		
		double vWert = 0;
		double aWert = 2;
		genaugikeit = 0.01;
		
		for (int n = 1;;n=n*2)
		{
				aWert +=1/n;
				
				if (aWert - vWert < genauigkeit)
				{
					System.out.println(aWert);
					break;
				}
				
			vWert = aWert;
		}
		
		
		
		return vWert;
		
		
	}

	public static void main(String[] args) {
	
	
		
	
		
	}
	
	

}
