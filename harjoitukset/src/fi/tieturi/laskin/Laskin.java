package fi.tieturi.laskin;

public class Laskin {
	private int viimeisinTulos;
	public int plus(int l1, int l2) {
		return viimeisinTulos = l1 + l2;
	}

	@Override
	public String toString() {
		return "LASKIN@"+hashCode();
//		return "Laskin-olio, viimeisin tulos: " + viimeisinTulos;
	}
	
	
}
