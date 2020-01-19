package depositocombustible;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoFillTestParametrizado {
	private double rellenado;
	private double nive;
	
	public DepositoFillTestParametrizado (double rell, double niv) {
		rellenado = rell;
		nive = niv;
	}
	
	public static Collection<Object[]> valores(){
		return Arrays.asList(new Object[][] {{40.0,40.0},{2.0,2.0},{-20.0,-20.0}});
	}

	@Test
	public void testFill() {
		DepositoCombustible deposito = new DepositoCombustible(50.0,0.0);
		deposito.fill(rellenado);
		double nivel = deposito.getDepositoNivel();
		assertEquals(nive, nivel, 1);
	}

}
