package fi.tieturi;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class LaskinTest {
	
	private NeliLaskin laskin = new NeliLaskin();
	
	@Test
	public void joku() {
		assertThat(1, is(equalTo(1)));
		assertThat(0, is(laskin.lisaa(0)));
		assertThat("sana", is(equalToIgnoringWhiteSpace(" sana ")));
		assertEquals("sana", " sana ".trim());
	}

	@Test
	public void plussaaJaNollaaOikein() {
		assertEquals(0, laskin.nollaa());
		assertEquals(1, laskin.lisaa(1));
		laskin.lisaa(4);
		assertEquals(7, laskin.lisaa(2));
		assertEquals(0, laskin.nollaa());
		assertEquals(1, laskin.lisaa(1));
	}
	
	@Test
	public void poikkeus() {
		assertThrows(ArithmeticException.class, () -> laskin.jaa(0)); 
	}
}
