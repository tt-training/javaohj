package fi.tieturi.henkilo;

import java.util.Optional;

import fi.tieturi.paivat.Paivamaara;

public class PaivaHenkilo extends Henkilo {
	private Optional<Paivamaara> syntymaAika; 
	
	public PaivaHenkilo() {
		this(null, null);
	}
	
	public PaivaHenkilo(String etunimi, String sukunimi) {
		super(etunimi, sukunimi, 0);
		syntymaAika = Optional.of(new Paivamaara(1, 1, 1970));
	}
	
	public Paivamaara getSyntymaAika() {
//		if (syntymaAika.isPresent())
//			return syntymaAika.get();
//		else 
//			return null;
		return syntymaAika.orElse(null);
	}

	public void setSyntymaAika(Paivamaara syntymaAika) {
		this.syntymaAika = Optional.ofNullable(syntymaAika);
	}

	@Override
	public int getIka() {
		Paivamaara tanaan = Paivamaara.nyt();
		int vuosiNyt = tanaan.getVuosi();
		if (syntymaAika.isEmpty()) {
			return super.getIka();
		}
		return vuosiNyt - syntymaAika.get().getVuosi();
	}
	
	@Override
	public void setIka(int ika) {
		System.err.println("Päivähenkilölle ei voi asettaa ikää");
	}
	
}
