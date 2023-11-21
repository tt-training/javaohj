package fi.tieturi.henkilo;

import java.util.Objects;

public class Henkilo extends Object {
	private String etunimi;
	private String sukunimi;
	private long ika;
	
	private static int viimeisinId = 0;
	private int id;

	public Henkilo() {
		++viimeisinId;
		this.id = viimeisinId; 
	}
	
	public Henkilo(String etunimi, String sukunimi, int ika) {
		this();
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
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(etunimi, sukunimi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Henkilo other = (Henkilo) obj;
		return Objects.equals(etunimi, other.etunimi) && Objects.equals(sukunimi, other.sukunimi);
	}

	@Override
	public String toString() {
		return "Henkilo [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", ika=" + getIka() + ", id=" + id + "]";
	}
	
}
