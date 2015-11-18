package Konto;

public class Demo_Konto {

	public static void main(String[] args) {
		Konto maxisKonto = new Konto();
		
		maxisKonto.setOwner("Maxis Konto");
		maxisKonto.payin(100);
		System.out.println(maxisKonto.getBalance());
	}

}
