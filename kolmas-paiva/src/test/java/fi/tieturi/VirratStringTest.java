package fi.tieturi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VirratStringTest {
    private List<String> alkuperainenLista;
    private VirratString sut = new VirratString();
    @BeforeEach
    public void setup() {
        alkuperainenLista = sut.luoViikonPaivatLista();
    }

    @Test
    public void isotSanoittain() {
        // Kutsutaan testattavaa metodia, saadaan se tuotos
        List<String> isot = sut.isot();
        // Tarkistetaan että saatu lista ei ole tyhjä
        assertFalse(isot.isEmpty());
        // Tarksitetaan että alkuperäisen listan ensimmäinen merkkijono muunnettuna isoiksi kirjamiksi on sama kuin haetun listan ensimmäinen alkio
        assertEquals(alkuperainenLista.get(0).toUpperCase(), isot.get(0));

        // Tarkistetaan että alkuperäisen listan koko on sama kuin saadun listan koko
        assertEquals(isot.size(), alkuperainenLista.size());

        // Käydään molemmat listat läpi ja katsotaan että samat sanat ovat siellä ja haetun listan sanat ovat isoina kirjaimina
        for(int i = 0 ; i < isot.size() ; ++i) {
            assertEquals(alkuperainenLista.get(i).toUpperCase(), isot.get(i));
        }
    }

    @Test
    public void isotMerkeittäin() {
        List<String> isot = sut.isot();
        for (String sana : isot) {
            for(char merkki : sana.toCharArray()) {
                if (Character.isAlphabetic(merkki)) {
                	assertTrue(Character.isUpperCase(merkki));
                }
            }
        }
    }

    @Test
    public void geneerinenIsoiksMuunnos() {
        List<String> testiAineisto = Arrays.asList("yksi", "Yksi", "YKSI", "yksi1", "kaksi sanaa");
        for(String sana : sut.isoiksi(testiAineisto)) {
            for (char merkki : sana.toCharArray()) {
                if (Character.isAlphabetic(merkki)) {
                assertTrue(Character.isUpperCase(merkki));
                }
            }
        }
    }

    @Test
    public void geneerinenIsoiksMuunnosOudotAlkiot() {
        List<String> testiAineisto = Arrays.asList("", " ", "2", "23", "!");
        List<String> tulos = sut.isoiksi(testiAineisto);
        for(String sana : sut.isoiksi(testiAineisto)) {
            for (char merkki : sana.toCharArray()) {
                if(Character.isAlphabetic(merkki)) {
                    assertTrue(Character.isUpperCase(merkki));
                }
            }
        }
    }

    @Test
    public void geneerinenIsoiksiNullKäsittely() {
        assertThrows(NullPointerException.class, () -> sut.isoiksi(null));
        assertThrows(NullPointerException.class, () -> sut.isoiksi(Arrays.asList(null)));
        assertDoesNotThrow(() -> sut.isoiksi(new ArrayList<>()));
    }

    @Test
    public void lukumääräTestaamistaNulleilla() {
        String s = null;
        assertFalse(s instanceof String);
        //assertEquals(1, sut.montako(Arrays.asList(null)));
        assertThrows(NullPointerException.class, () -> sut.montako(null));
    }

    @Test
    public void testaaPituudet() {
        String tulos = sut.pituudet(Arrays.asList("yy", "ka", "koo"));
        assertEquals("2, 2, 3", tulos);
        tulos = sut.pituudet(Arrays.asList("yy", "two"));
        assertEquals("2", tulos);
        tulos = sut.pituudet(Arrays.asList("1", "", "twelve", "2"));
        assertEquals("1, 0, 1", tulos);
    }

}