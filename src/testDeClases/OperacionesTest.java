//Test para la clase Operaciones. Miguel Vilanova


package testDeClases;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import principal.Operaciones;

public class OperacionesTest {

	@Test
	public void numPrimo() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		int numero = 3;
		boolean esperado = true;
		// 2. ACT (Ejecutar)
		boolean obtenido = op.numPrimo(numero);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}

	@Test
	public void numIesimoPrimo() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		int numero = 4;
		int esperado = 7;
		// 2. ACT (Ejecutar)
		int obtenido = op.numIesimoPrimo(numero);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
}
