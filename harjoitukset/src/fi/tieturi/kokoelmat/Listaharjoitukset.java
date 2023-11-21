package fi.tieturi.kokoelmat;

import fi.tieturi.henkilo.Henkilo;

import java.util.*;

public class Listaharjoitukset {

    private void listaMerkkijonoja() {
        List<String> lista = new ArrayList<>();
        lista.add("Tara");
        lista.add("Catarina");
        lista.add("Robin");
        lista.add("Annika");
        lista.add("Sandra");
        System.out.println(lista);
        for(String nimi : lista) {
            System.out.println(nimi);
        }
    }

    private void listaHenkiloita(){
        List<Henkilo> henkilot = new ArrayList<>(
            Arrays.asList(new Henkilo("Yksi", "Yksi", 1),
                        new Henkilo("Kaksi", "Kaksi", 2),
                        new Henkilo("Kolme", "Kolme", 3),
                        new Henkilo("nejlä", "neljä", 4),
                        new Henkilo("Yksi", "Yksi", 11))
        );
        for(Henkilo h : henkilot) {
            System.out.println(h);
        }
        
        System.out.println("Onk listalla: " + henkilot.contains(new Henkilo("Yksi", "Yksi", 0)));
    }

    private void kokoelmaHenkiloita(){
        List<Henkilo> lista = Arrays.asList(
                new Henkilo("Yksi", "Yksi", 1),
                new Henkilo("Kaksi", "Kaksi", 2),
                new Henkilo("Kolme", "Kolme", 3),
                new Henkilo("nejlä", "neljä", 4),
                new Henkilo("Yksi", "Yksi", 11)
        );
        Collection<Henkilo> henkilot = lista;
        for(Henkilo h : henkilot) {
            System.out.println(h);
        }
        System.out.println();
        henkilot = new HashSet<>(lista);
        for(Henkilo h : henkilot) {
            System.out.println(h);
        }
    }

    private void poistaListalta() {
        List<String> vkonPäivät = luoViikonPaivatLista();
        vkonPäivät.add("Kahdeksas");
        System.out.println(vkonPäivät);
        
        Set<String> tAlkuiset = new HashSet<>();
        for (String pv : vkonPäivät) {
            if (pv.startsWith("t")) {
                tAlkuiset.add(pv);
            	//vkonPäivät.remove(pv);
            }
        }
        vkonPäivät.removeAll(tAlkuiset);
        System.out.println(vkonPäivät);
    }
    
    private void poistaListaltaIteraattorilla() {
        List<String> vkonPäivät = luoViikonPaivatLista();
        
        for (Iterator<String> it = vkonPäivät.iterator() ; it.hasNext() ;) {
        	String pv = it.next();
            if (pv.startsWith("t")) {
            	it.remove();
            }
        }
        System.out.println(vkonPäivät);
    }


    private List<String> luoViikonPaivatLista() {
        // Arrays.ArrayList on immutable, mutta helppo rakentaa
        List<String> lista = Arrays.asList("maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai", "sunnuntai");
        // Palautetaan kuitenkin ArrayList jota voi muokattava
        return new ArrayList<>(lista);
    }

    public static void main(String[] args)  {
        Listaharjoitukset harjoitus = new Listaharjoitukset();
		harjoitus.poistaListalta();
    }
}
