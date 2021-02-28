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
	
	@Test
	public void porcentaje() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		double numero1 = 4;
		double numero2 = 16;
		double esperado = 0.64;
		// 2. ACT (Ejecutar)
		double obtenido = op.porcentaje(numero1, numero2);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void factorial() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		int numero = 5;
		int esperado = 120;
		// 2. ACT (Ejecutar)
		int obtenido = op.factorial(numero);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
	//TEST CASOS ESPECIALES
	
	@Test
	public void numPrimoNegativo() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		int numero = -3;
		boolean esperado = false;
		// 2. ACT (Ejecutar)
		boolean obtenido = op.numPrimo(numero);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void numIesimoPrimoNegativo() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		int numero = -10;
		int esperado = -1;
		// 2. ACT (Ejecutar)
		int obtenido = op.numIesimoPrimo(numero);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void porcentajeInfinito() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		double numero1 = Double.POSITIVE_INFINITY;
		double numero2 = 15;
		double esperado = Double.POSITIVE_INFINITY;;
		// 2. ACT (Ejecutar)
		double obtenido = op.porcentaje(numero1, numero2);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
	
	@Test
	public void factorialCero() {
		// 1. ARRANGED (preparar)
		Operaciones op= new Operaciones();
		int numero = 0;
		int esperado = 1;
		// 2. ACT (Ejecutar)
		int obtenido = op.factorial(numero);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}

}


