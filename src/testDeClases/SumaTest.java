package testDeClases;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import principal.Suma;

public class SumaTest {


	// Test método SumaDosReales
		
			@Test
			public void sumaDosReales() {
				// 1. ARRANGED (preparar)
				Suma sum = new Suma();
				double numReal1 = 2.5;
				double numReal2 = 3.5;
				double esperado = 6;
				// 2. ACT (Ejecutar)
				double obtenido = sum.sumaDosReales(numReal1, numReal2);
				// 3. Assert (comprobar)
				assertEquals(esperado, obtenido);
			}

	// Test método SumaDosEnteros
			
			@Test
			public void sumaDosEnteros() {
				// 1. ARRANGED (preparar)
				Suma sum = new Suma();
				int numEnt1 = 20;
				int numEnt2 = 20;
				int esperado = 40;
				// 2. ACT (Ejecutar)
				int obtenido = sum.sumaDosEnteros(numEnt1, numEnt2);
				// 3. Assert (comprobar)
				assertEquals(esperado, obtenido);
			}

	// Test método SumaTresReales
			
			@Test
			public void sumaTresReales() {
					// 1. ARRANGED (preparar)
					Suma sum= new Suma();
					double numReal1= 0.5;
					double numReal2= 5.05;
					double numReal3= 12.50;
					double esperado= 18.05;
					// 2. ACT (Ejecutar)
					double obtenido = sum.sumaTresReales(numReal1, numReal2, numReal3);
					// 3. Assert (comprobar)
					assertEquals(esperado,obtenido);
			}		
					
	// Test método SumaValoresMetidos
			
			@Test
			public void sumaValoresMetidos() {
				// 1. ARRANGED (preparar)
				Suma sum = new Suma();
				int numLeido = 2;
				int esperado1 = 2;
				int esperado2 = 4;
				// 2. ACT (Ejecutar)
				int obtenido1 = sum.sumaValoresMetidos(numLeido);
				int obtenido2 = sum.sumaValoresMetidos(numLeido);
				// 3. Assert (comprobar)
				assertEquals(esperado1, obtenido1);
				assertEquals(esperado2, obtenido2);
			}

						// TEST DE CASOS RAROS//
			
			
			
			
			// Test sumar un valor negativo

			@Test
			public void sumaUnValorNegativoElResultadoEsUnaResta() {
				// 1. ARRANGED (preparar)
				Suma sum = new Suma();
				double numReal1= -0.5;
				double numReal2= 5.05;
				double esperado= 4.55;
				// 2. ACT (Ejecutar)
				double obtenido = sum.sumaDosReales(numReal1, numReal2);
				// 3. Assert (comprobar)
				assertEquals(esperado,obtenido);
			}
			
}
