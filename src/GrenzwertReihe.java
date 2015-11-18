
public class GrenzwertReihe {

	public static void main(String[] args) {
		
		System.out.println(schritt1(0.01));
		

	}

	private static double schritt1(double genauigkeit) {
		
		
		double aWert  = 0;
		double vWert = 0;
		
		for(int i = 1; ; i*=2)
		{
			aWert += 1.0/i;
				if(aWert - vWert < genauigkeit) {
					
					break;
					}
				vWert = aWert;
				}
				
			
		}
		
	}

}
