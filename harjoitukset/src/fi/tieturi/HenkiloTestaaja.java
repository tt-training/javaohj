package fi.tieturi;

import fi.tieturi.henkilo.Henkilo;

public class HenkiloTestaaja {
	public static void main(String[] a) {
		Henkilo h = new Henkilo("Aku", "Ankka", 78);
		System.out.println(h);
		
		h.setIka(71);
		System.out.println(h);
	}
}
