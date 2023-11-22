package fi.tieturi;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Hellot {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		d = new Date(2023-1900, 11-1, 21);
		
		Calendar cal = Calendar.getInstance();
		
		cal = new GregorianCalendar(2023, Calendar.NOVEMBER, 21, 15, 12);
		
		System.out.println(d);
		//harjoitus2(args);
	}
	
	// Hello
	private static void harjoitus1(String [] args) {
		
	}
	
	// Hello monesti
	private static void harjoitus2(String [] args) {
		if (args.length < 1) {
			System.out.println("Anna tasan yksi parametri");
			return;
		}
		// int montako = "6"; // ei toimi asetus
		int lkm = Integer.parseInt(args[0]);
		for(int i = 0 ; i < lkm ; ++i) {
			System.out.println("Terve");
		}
	}
	
	// Kokonaisluvut silmukoiden
	private static void harjoitus3(String [] args) {
		int [] luvut = luoLukuTaulu();
		
		laskeJaTulostaSumma(luvut); // 12
		laskeJaTulostaKeskiarvo(luvut); // 2

		// if (true) return;
		
		luvut = arvoLuvut(100);
		laskeJaTulostaSumma(luvut); 
		laskeJaTulostaKeskiarvo(luvut);
		
		int pienin = luvut[0];
		for(int lk : luvut) {
			if (pienin > lk) {
				pienin = lk;
			}
		}
		System.out.println("Pienin: " + pienin);
		
		int suurin = Arrays.stream(luvut).max().getAsInt();		
		System.out.println("Suurin: " + suurin);
		
	}

	private static void laskeJaTulostaKeskiarvo(int[] luvut) {		
		int summa = 0;
		for (int luku : luvut) {
			summa = summa + luku;
		}
		double ka = ((double)summa) / luvut.length;
		System.out.println("Keskiarvo: " + ka);
		
		// System.out.println("Jännä: " + (0.1 + 0.2));
	}

	private static void laskeJaTulostaSumma(int[] luvut) {
		int summa = 0;
		for (int luku : luvut) {
			summa = summa + luku;
		}
		System.out.println("Summa: " + summa);
	}

	private static int[] luoLukuTaulu() {
		return new int [] { 1, 1, 2, 3, 5 
			};
			//	, 8, 13, 21 };
	}
	
    private static int[] arvoLuvut(int koko) {
		int [] luvut = new int[koko];
		java.util.Random rng = new java.util.Random();
		for (int i = 0 ; i < luvut.length ; ++i) {
		    luvut[i] = rng.nextInt(0, 1001);
		}
		return luvut;
    }

}
