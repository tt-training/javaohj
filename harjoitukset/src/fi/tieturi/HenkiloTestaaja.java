package fi.tieturi;

import fi.tieturi.henkilo.Henkilo;

public class HenkiloTestaaja {
	public static void main(String[] a) {
		Henkilo h = new Henkilo("Aku", "Ankka", 78);
		System.out.println(h);
		h.setIka(71);
		System.out.println(h);
		Henkilo k;
		if (true) {
			k = new Henkilo();
			System.out.println(k);
		} else {
			k = new Henkilo("sadj", "sad", 3);
		}
		k.setEtunimi("Uusi");
		System.out.println(k);
		System.out.println(h);
		
		System.out.println();
		
		Henkilo h1 = new Henkilo("Oskari", "Olematon", 10);
		Henkilo h3 = new Henkilo("Oskari", "Olematon", 11);
		Henkilo h2 = h1;
		System.out.println(h1);
		//h2.setIka(h2.getIka() + 1);
		h2.vanhene();
		System.out.println(h1);
		System.out.println(h1 == h2 ? "Samat" : "Erit");
		System.out.println(h3);
		if ( h1.equals(h3) ) {
			System.out.println("Samat-if");
		} else {
			System.out.println("Erit-if");
		}
		
		String s1 = "Saatin";
		String s2 = new String("Saatin");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		h3.setIka(-7);
		System.out.println(h3);
		
		System.out.println(new Henkilo("a", "A", -6));
		
		h3.setIka(Integer.MAX_VALUE);
		System.out.println(h3);
		h3.vanhene();
		System.out.println(h3);
		System.out.println("H3 ikä: " + h3.getIka());
	}
}
