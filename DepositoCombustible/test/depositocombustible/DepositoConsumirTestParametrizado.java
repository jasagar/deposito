package depositocombustible;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoConsumirTestParametrizado {
	private double consumido;
	private double nive;
	
	public DepositoConsumirTestParametrizado (double con, double niv) {
		consumido = con;
		nive = niv;
	}
	
	public static Collection<Object[]> valores(){
		return Arrays.asList(new Object[][] {{40.0,10.0},{2.0,48.0},{-20.0,70.0}});		
	}

	@Test
	public void testConsumir() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		deposito.consumir(consumido);
		double nivel = deposito.getDepositoNivel();
		assertEquals(nive, nivel, 1);
	}

}
