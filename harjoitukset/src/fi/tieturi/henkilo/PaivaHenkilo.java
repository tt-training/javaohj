package fi.tieturi.henkilo;

import fi.tieturi.paivat.Paivamaara;

public class PaivaHenkilo extends Henkilo {
	private Paivamaara syntymaAika; 
	
	public PaivaHenkilo() {
		this(null, null);
	}
	
	public PaivaHenkilo(String etunimi, String sukunimi) {
		super(etunimi, sukunimi, 0);
		syntymaAika = new Paivamaara(1, 1, 1970);
	}
	
	public Paivamaara getSyntymaAika() {
		return syntymaAika;
	}

	public void setSyntymaAika(Paivamaara syntymaAika) {
		this.syntymaAika = syntymaAika;
	}

	@Override
	public int getIka() {
		Paivamaara tanaan = Paivamaara.nyt();
		int vuosiNyt = tanaan.getVuosi();
		if (syntymaAika == null) {
			return super.getIka();
		}
		return vuosiNyt - syntymaAika.getVuosi();
	}
	
	@Override
	public void setIka(int ika) {
		System.err.println("Päivähenkilölle ei voi asettaa ikää");
	}
	
}
