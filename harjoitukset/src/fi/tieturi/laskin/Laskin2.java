package fi.tieturi.laskin;

public class Laskin2 {
	private int tulos;
	private int muisti;
	
	public int lisaa(int luku) {
		return tulos += luku;
	}
	public int vahenna(int luku) {
		return tulos -= luku;
	}
	public int kerro(int luku) {
		return tulos *= luku;
	}
	public int jaa(int luku) {
		return tulos /= luku;
	}
	public int nollaa() {
		tulos = 0;
		return tulos;
	}
	public void talleta() {
		muisti = tulos;
	}
	public int palauta() {
		return muisti;
	}
	public void nollaaMuisti() {
		muisti = 0;
	}
}
