package fi.tieturi;

import java.util.ArrayList;
import java.util.List;

import fi.tieturi.henkilo.Henkilo;
import fi.tieturi.henkilo.PaivaHenkilo;
import fi.tieturi.paivat.Paivamaara;

public class PaivaHenkiloTestaaja {
    public static void main(String[] args) {
    	Henkilo h = new Henkilo();
    	PaivaHenkilo ph = new PaivaHenkilo();
        ph.setEtunimi("Paiva");
        ph.setSukunimi("Paiste");
        System.out.println(ph);
        Paivamaara joku = new Paivamaara(21, 11, 2011);
        //ph.setSyntymaAika(Paivamaara.nyt());
        ph.setSyntymaAika(joku);
        ph.setIka(123);
        
        System.out.println(ph);
        
        String tulos = "1" + "2" + "3" + ph.toString();
        List<String> lista = new ArrayList<>();
        lista.add("dsf");
    }
}
