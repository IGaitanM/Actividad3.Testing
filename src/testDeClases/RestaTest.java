// Test de la clase Resta. Iván Gaitán Muñoz

package testDeClases;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import principal.Resta;

public class RestaTest {

	// Test para el método RestaDosReales
	@Test
	public void RestaDosReales() {
		// 1. ARRANGED (preparar)
		Resta res = new Resta();
		double numReal1 = 2.5;
		double numReal2 = 3.85;
		double esperado = -1.35;
		// 2. ACT (Ejecutar)
		double obtenido = res.restaDosReales(numReal1, numReal2);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}

	// Test para el método RestaDosEnteros
	@Test
	public void RestaDosEnteros() {
		// 1. ARRANGED (preparar)
		Resta res = new Resta();
		int numEnt1 = 521;
		int numEnt2 = 421;
		int esperado = 100;
		// 2. ACT (Ejecutar)
		int obtenido = res.restaDosEnteros(numEnt1, numEnt2);
		// 3. Assert (comprobar)
		assertEquals(esperado, obtenido);
	}
	
	
			
	// Test para el método RestaTresReales
	@Test
	public void RestaTresReales() {
			// 1. ARRANGED (preparar)
			Resta res= new Resta();
			double numReal1= 20.5;
			double numReal2= 3.05;
			double numReal3= 5.50;
			double esperado= 11.95;
			// 2. ACT (Ejecutar)
			double obtenido = res.restaTresReales(numReal1, numReal2, numReal3);
			// 3. Assert (comprobar)
			assertEquals(esperado,obtenido);
	}		
			
	// Test para el método RestaValoresMetidos
	@Test
	public void RestaValoresMetidos() {
		// 1. ARRANGED (preparar)
		Resta res = new Resta();
		int numLeido = 20;
		int esperado1 = -20;
		int esperado2 = -40;
		// 2. ACT (Ejecutar)
		int obtenido1 = res.restaValoresMetidos(numLeido);
		int obtenido2 = res.restaValoresMetidos(numLeido);
		// 3. Assert (comprobar)
		assertEquals(esperado1, obtenido1);
		assertEquals(esperado2, obtenido2);
	}
	
	// TEST DE CASOS RAROS
	
		@Test
		public void elSegundoParametroSiEsNegativoHaraUnaSuma() {
			Resta res = new Resta();
			int numEnt1 = 5;
			int numEnt2 = -5;
			int esperado = 10;
			int obtenido = res.restaDosEnteros(numEnt1, numEnt2);
			assertEquals(esperado, obtenido);
		}
		
		@Test
		public void siElSegundoParametroEsInfinitoNegativoElResltadoEsInfinitoPositivo() {
			Resta res = new Resta();
			double num1 = 5;
			double num2 = Double.NEGATIVE_INFINITY;
			double esperado = Double.POSITIVE_INFINITY;
			double obtenido = res.restaDosReales(num1, num2);
			assertEquals(esperado, obtenido);
		}
		
		@Test
		public void siUnParametroEsInfinitoPositivoElrestultaEsInfinitoPositivo() {
			Resta res = new Resta();
			double num1 = Double.POSITIVE_INFINITY;
			double num2 = 5.2;
			double esperado = Double.POSITIVE_INFINITY;
			double obtenido = res.restaDosReales(num1, num2);
			assertEquals(esperado, obtenido);
		}
		
		@Test
		public void siSeUsanDosParametrosInfinitosElResultadoEsNan() {
			Resta res = new Resta();
			double num1 = Double.POSITIVE_INFINITY;
			double num2 = Double.POSITIVE_INFINITY;
			double esperado = Double.NaN;
			double obtenido = res.restaDosReales(num1, num2);
			assertEquals(esperado, obtenido);
		}
		
		@Test
		public void siUnParametroEsNaNElResultadoEsNan() {
			Resta res = new Resta();
			double num1 = Double.NaN;
			double num2 = 5.5;
			double esperado = Double.NaN;
			double obtenido = res.restaDosReales(num1, num2);
			assertEquals(esperado, obtenido);
		}
}
