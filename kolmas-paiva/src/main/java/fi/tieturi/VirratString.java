package fi.tieturi;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class VirratString {

    public List<String> isot() {
        return luoViikonPaivatLista().stream()
                .map(String::toUpperCase)
                .toList();
    }

    public List<String> isoiksi(List<String> alkuperäinen) {
        return alkuperäinen
        		.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public String pilkullaErotettu1() {
        return luoViikonPaivatLista()
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }

    public String pilkullaErotettu2() {
        // aina ei tarvitse ottaa streameja käyttöön jos valmis data on jo
        return String.join(", ", isoiksi(luoViikonPaivatLista()));
    }

    /**
     * Laskee montako String-tyyppistä oliota listalla on. Tässä tapauksessa
     * myös null lasketaan merkkijonoksi: ajatuksena että <code>String s = null;</code>
     * on syntaktisesti validia koodia.
     * @param lista
     * @return merkkijonojen määrä
     */
    public long montako(List<?> lista) {
        return lista.stream()
                .filter(o -> o == null || o instanceof String)
                .count();
    }

    public List<String> teeEiToimi() {
        return luoViikonPaivatLista()
                .stream()
                .filter(s -> !s.startsWith("t") && !s.startsWith("T"))
                .toList();
    }

    public Optional<String> jokuOkirjain() {
        return luoViikonPaivatLista()
                .stream()
                .filter(s -> s.contains("o"))
                .findFirst();
    }

    public String pituudet(List<String> lista) {
        return lista.stream()
                .filter(s -> s.isEmpty() || !s.substring(0,1).equalsIgnoreCase("t"))
                .mapToInt(String::length)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public List<String> luoViikonPaivatLista() {
        return Arrays.asList("maanantai", "tiistai", "keskiviikko", "torstai",
                "perjantai", "lauantai", "Sunnuntai", "äläpäivä", "torstai");
    }

    public List<String> sortatutVkonpv() {
    	return luoViikonPaivatLista().stream()
    				.sorted(Collator.getInstance(new Locale("FI")))
    				.toList();
    }

    public static void main(String[] args) {
        VirratString virrat = new VirratString();
        System.out.println(virrat.sortatutVkonpv());
    }
}
