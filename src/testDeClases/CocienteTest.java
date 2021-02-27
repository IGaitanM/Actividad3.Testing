// Test de la clase Resta. Iván Gaitán Muñoz

package testDeClases;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import principal.Cociente;

public class CocienteTest {

			// Test para método dividirDosReales.
			@Test
			public void dividirDosReales() {
				// 1. ARRANGED (preparar)
				Cociente cociente1 = new Cociente();
				double numReal1 = 6.0;
				double numReal2 = 1.5;
				double esperado = 4.0;
				// 2. ACT (ejecutar)
				double obtenido = cociente1.dividirDosReales(numReal1, numReal2);
				// 3. ASSERT (comprobar)
				assertEquals(esperado, obtenido);
			}
			
			//Test para método dividirDosEnteros.
			@Test
			public void dividirDosEnteros() {
				// 1. ARRANGED (preparar)
				Cociente cociente1 = new Cociente();
				int numEnt1 = 300;
				int numEnt2 = 5;
				int esperado = 60;
				// 2. ACT (ejecutar)
				int obtenido = cociente1.dividirDosEnteros(numEnt1, numEnt2);
				// 3. ASSERT (comprobar)
				assertEquals(esperado, obtenido);
			}
			
			// Test para método inverso.
			@Test
			public void inverso() {
				// 1. ARRANGED (preparar)
				Cociente cociente1 = new Cociente();
				double num = 100.0;
				double esperado = 1/num;
				// 2. ACT (ejecutar)
				double obtenido = cociente1.inverso(num);
				// 3. ASSERT (comprobar)
				assertEquals(esperado, obtenido);
			}
			
			// Test para método raiz.
			@Test
			public void raiz() {
				// 1. ARRANGED (preparar)
				Cociente cociente1 = new Cociente();
				double num = 30.0;
				double esperado = 5.477225575051661;
				// 2. ACT (ejecutar)
				double obtenido = cociente1.raiz(num);
				// 3. ASSERT (comprobar)
				assertEquals(esperado, obtenido);
			}
			
			// Test de Caso especial del método raiz.
			@Test
			public void raizConNegativeInfinityElResultadoNaN() {
				// 1. ARRANGED (preparar)
				Cociente cociente1 = new Cociente();
				double num = Double.NEGATIVE_INFINITY;
				double esperado = 0;
				// 2. ACT (ejecutar)
				double obtenido = cociente1.raiz(num);
				// 3. ASSERT (comprobar)
				assertEquals(esperado, obtenido);
			}
			
			// Test de Caso especial del método dividirDosReales.
			@Test
			public void dividirDosRealesConMaxValueYMinValueResultadoInfinity() {
				// 1. ARRANGED (preparar)
				Cociente cociente1 = new Cociente();
				double numReal1 = Double.MAX_VALUE;
				double numReal2 = Double.MIN_VALUE;
				double esperado = 0;
				// 2. ACT (ejecutar)
				double obtenido = cociente1.dividirDosReales(numReal1, numReal2);
				// 3. ASSERT (comprobar)
				assertEquals(esperado, obtenido);
			}
			
}