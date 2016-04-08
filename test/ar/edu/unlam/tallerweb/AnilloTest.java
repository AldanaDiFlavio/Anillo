package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnilloTest {

	@Test
	public void testPerimetroDelCirculoInterno() {
		Anillo miAnillo = new Anillo();
		Double radioEsperado=12.56;
		Double radioObtenido=miAnillo.perimetroDelCirculoInterior(2.0);
		assertEquals(radioEsperado, radioObtenido);
	}

	@Test
	public void testPerimetroDelCirculoExterno() {
		Anillo miAnillo = new Anillo();
		Double radioEsperado=25.12;
		Double radioObtenido=miAnillo.perimetroDelCirculoExterior(4.0);
		assertEquals(radioEsperado, radioObtenido);
	}
	
	@Test
	public void testAreaDelAnillo() {
		Anillo miAnillo = new Anillo();
		Double areaEsperada=37.68;
		Double areaObtenida = miAnillo.AreaDelCirculo(4.0,2.0);
		assertEquals(areaEsperada, areaObtenida);
		
	}
}
