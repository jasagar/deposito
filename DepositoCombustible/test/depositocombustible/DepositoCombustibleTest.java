package depositocombustible;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		Double niv = 0.0;
		Double nivel = deposito.getDepositoNivel();
		assertEquals(niv, nivel);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		Double max = 50.0;
		Double maximo = deposito.getDepositoMax();
		assertEquals(max, maximo);
	}

	@Test
	public void testEstaVacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		fail("Not yet implemented");
	}

	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
