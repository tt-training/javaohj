package fi.tieturi;


public class HelloWorld {
	
	private int luku = 11;
	
	public static void main(String [] args) {
		
		System.out.println("Hei maailma");
		
		System.out.println("Luku: " + new HelloWorld().luku);
		
		PuppuKoodi lka = new PuppuKoodi();
		
//		for (int i = 0 ; i < args.length ; ++i) {
//			String a = args[i];
//			
//		}
//		
		for(String a : args) {
			a = "a";
		}
		
		String c;
		{
			
			c = "b";
		}
		
		c = "";
	}
	
	String merkkijono;
	
	public void puuppu() {
		String sana;
		merkkijono = "hei";
		sana = "joo";
	}
	
	public void foo() {
		
	}
	
	private static void esim() {
		
		
		esimWhile();
		
		for(int i = 0; i < 12; ++i) {
			//sladsalk
		}
	}

	private static void esimWhile() {
		int i = 0;
		while(i < 12) {
			// sladsk
			++i;
		}
		
		String sana;
		
		
		sana = "Hei";
		HelloWorld hw = new HelloWorld();
		hw.esimerkkia();
	}
	
	public void esimerkkia() {
		PuppuKoodi lka = new PuppuKoodi(105);
		lka = new PuppuKoodi();
		lka.oeltusMetodi();
		luku += 12;
		
		PuppuKoodi.julkinen = "hups";
		// PuppuKoodi.piilossa = "hups";
		int arvo;
		
		if ( luku > 0) {
			arvo = 2;
		} else {
			arvo = 3;
		}
		
		System.out.println(arvo);
	}
	
	
}
