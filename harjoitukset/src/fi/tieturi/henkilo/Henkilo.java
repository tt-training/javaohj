package fi.tieturi.henkilo;

public class Henkilo extends Object {
	private String etunimi;
	private String sukunimi;
	private long ika;

	public Henkilo() {
		
	}
	
	public Henkilo(String etunimi, String sukunimi, int ika) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		setIka(ika);
	}
	
	public void vanhene() {
		++ika;
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
		return (int)ika;
	}

	public void setIka(int ika) {
		if (ika < 0) {
			System.err.println("Ikä ei voi ola alle 0 : " + ika);
			return;
		}
		this.ika = ika;
	}

	@Override
	public String toString() {
		return "Henkilo [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", ika=" + getIka() + "]";
	}
	
}
