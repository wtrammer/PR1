
public class LoopDemos {

	public static void main(String[] args) {

		//IDEAL!!!:
		for(int i  =1; i <= 10; i++) {
			System.out.println("Durchlauf1 "+i);
		}
		
		int j = 1;
		while(j <= 10) {
			System.out.println("Durchlauf2 "+j);
			j++;
		}
		
		int y=1;
		for (;y<=10;){
			System.out.println("Durchlauf3 "+y);
			y++;
		}
		
		for(int x = 10; x >=0; x--) {
			System.out.println("Durchlauf4 "+x);
		}
		
		//20-90 jede 5 Zahl
		for(int z=20;z<=90;z+=5){
			System.out.println("Durchlauf5: "+z);
		}
		
		//1-100 nur jene die durch 3 teilbar sind ausgeben (nur die ersten 10)
		
		
		int zaehler = 0;
		for(int a=1; a<=100; a++){
			
			if (a%3 == 0){
				System.out.println(a);
				zaehler++;
			}
			if (zaehler==10)
				break;
			
		//Ausgabe aller Zahlen 1-100 die durch 5 teilbar sind - 40-70 von der ausgabe ausschließen
			
			int z = 0;
			for (int d=1; d<=100; d++){
				
				if( (d >= 40 && d<= 70) || (d % 5 == 0)) {
					continue;
				}
		
					
					System.out.println("Durchlauf99: "+d);
					
				}
			}
			
		}
		
		
	}


