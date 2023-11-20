package fi.tieturi;

public class PuppuKoodi {
	private int arvo;
	private final int suurin;
	
	/**
	 * Tarkoituksella package private
	 */
	void oeltusMetodi() {
		
	}
	
	public static String julkinen;
	private static String piilossa;
	
	// static String sana;
	
	/*
	 
	 */
	
	public PuppuKoodi() {
		this(42);
	}
	public PuppuKoodi(int arvo) {
		this.arvo = arvo;
		suurin = arvo * 3;
	}
	public int getArvo() {
		return arvo;
	}
	public void setArvo(int arvo) {
		this.arvo = arvo;
	}
		
}
