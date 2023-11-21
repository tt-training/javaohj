package fi.tieturi;

import fi.tieturi.paivat.Paivamaara;

public class PaivaHenkiloTestaaja {
    public static void main(String[] args) {
    	fi.tieturi.henkilo.PaivaHenkilo ph = new fi.tieturi.henkilo.PaivaHenkilo();
        ph.setEtunimi("Paiva");
        ph.setSukunimi("Paiste");
        System.out.println(ph);
        Paivamaara joku = new Paivamaara(21, 11, 2011);
        //ph.setSyntymaAika(Paivamaara.nyt());
        ph.setSyntymaAika(joku);
        ph.setIka(123);
        
        System.out.println(ph);
    }
}
