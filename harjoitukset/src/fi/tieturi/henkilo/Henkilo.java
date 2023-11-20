package fi.tieturi.henkilo;

public class Henkilo {
	private String etunimi = null;
	private String sukunimi = null;
	private int ika = 0;

	public Henkilo() {
		
	}
	
	public Henkilo(String etunimi, String sukunimi, int ika) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.ika = ika;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public int getIka() {
		return ika;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}

	@Override
	public String toString() {
		return "Henkilo [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", ika=" + ika + "]";
	}
	
}
