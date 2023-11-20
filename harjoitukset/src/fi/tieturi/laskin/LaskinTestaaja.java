package fi.tieturi.laskin;

public class LaskinTestaaja {

	public static void main(String[] args) {
		Laskin laskin = new Laskin();
		int tulos = laskin.plus(2, 3);
		laskin.plus(12, 45);
		System.out.println(laskin);
	}
	
	private static void laskin2() {
		Laskin2 laskin = new Laskin2();
		
	}

}
