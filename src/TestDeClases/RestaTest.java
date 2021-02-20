// Test de la clase Resta. Iván Gaitán Muñoz

package TestDeClases;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Principal.Resta;

public class RestaTest {

	@Test
	public void RestaDosReales() {
		// 1. ARRANGED (preparar)
		Resta res= new Resta();
		double numReal1= 2.5;
		double numReal2= 3.85;
		double esperado= -1.35;
		// 2. ACT (Ejecutar)
		double obtenido = res.restaDosReales(numReal1, numReal2);
		// 3. Assert (comprobar)
		assertEquals(esperado,obtenido);
	}

}
