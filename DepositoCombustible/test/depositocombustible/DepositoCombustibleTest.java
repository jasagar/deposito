package depositocombustible;

import static org.junit.Assert.*;


import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		double niv = 0.0;
		double nivel = deposito.getDepositoNivel();
		assertEquals(niv, nivel, 1);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		double max = 50.0;
		double maximo = deposito.getDepositoMax();
		assertEquals(max, maximo, 1);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		boolean vac = true;
		boolean vacio = deposito.estaVacio();
		assertTrue(vac == vacio);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,50.0);
		boolean lle = true;
		boolean lleno = deposito.estaLleno();
		assertTrue(lle == lleno);
	}

	@Test
	public void testMitadMax() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,25.0);
		double mit = 25.0;
		double mitad = deposito.getDepositoMax() / 2;
		assertEquals(mit, mitad, 1);
	}

}
