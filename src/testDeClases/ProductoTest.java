package testDeClases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import principal.Producto;

public class ProductoTest {
	// Test para el método MultiplicacionDosReales
		@Test
		public void multiplicacionDosReales() {
			// 1. ARRANGED (preparar)
			Producto pro = new Producto();
			double numReal1 = 3.4;
			double numReal2 = 6.9;
			double esperado = 23.46;
			// 2. ACT (Ejecutar)
			double obtenido = pro.multiplicacionDosReales(numReal1, numReal2);
			// 3. Assert (comprobar)
			assertEquals(esperado, obtenido);
		}

		// Test para el método multiplicacionDosEnteros
		@Test
		public void multiplicacionDosEnteros() {
			// 1. ARRANGED (preparar)
			Producto pro = new Producto();
			int numEnt1 = 555;
			int numEnt2 = 2;
			int esperado = 1110;
			// 2. ACT (Ejecutar)
			int obtenido = pro.multiplicacionDosEnteros(numEnt1, numEnt2);
			// 3. Assert (comprobar)
			assertEquals(esperado, obtenido);
		}

		// Test para el método multiplicacionTresReales
		@Test
		public void multiplicacionTresReales() {
				// 1. ARRANGED (preparar)
			Producto pro = new Producto();
				double numReal1= 27.3;
				double numReal2= 5.03;
				double numReal3= 1.2;
				double esperado= 164.7828;
				// 2. ACT (Ejecutar)
				double obtenido = pro.multiplicacionTresReales(numReal1, numReal2, numReal3);
				// 3. Assert (comprobar)
				assertEquals(esperado,obtenido);
		}		
				
		// Test para el método Potencia
		@Test
		public void potencia() {
			// 1. ARRANGED (preparar)
			Producto pro = new Producto();
			int base = 2;
			int exponente = 3;
			int esperado2 = 8;
			// 2. ACT (Ejecutar)
			int obtenido1 = pro.potencia(base, exponente);
			// 3. Assert (comprobar)
			assertEquals(esperado2, obtenido1);
		}
		// Test propiedades potencias
		@Test
		public void potenciaDeUnNumeroAcero() {
			// 1. ARRANGED (preparar)
			Producto pro = new Producto();
			int base = 385;
			int exponente = 0;
			int esperado2 = 1;
			// 2. ACT (Ejecutar)
			int obtenido1 = pro.potencia(base, exponente);
			// 3. Assert (comprobar)
			assertEquals(esperado2, obtenido1);
		}
		// Test propiedades potencias
				@Test
				public void potenciaDeUnNumeroAUnNumeroNegativo() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					int base = 2;
					int exponente = -3;
					int esperado2 = 1/8;
					// 2. ACT (Ejecutar)
					int obtenido1 = pro.potencia(base, exponente);
					// 3. Assert (comprobar)
					assertEquals(esperado2, obtenido1);
				}
		// Test para casos raros
		@Test
		public void potenciaDeCeroAUnNumeroEnorme() {
			// 1. ARRANGED (preparar)
			Producto pro = new Producto();
			int base = 0;
			int exponente = Integer.MAX_VALUE;
			int esperado2 = 0;
			// 2. ACT (Ejecutar)
			int obtenido1 = pro.potencia(base, exponente);
			// 3. Assert (comprobar)
			assertEquals(esperado2, obtenido1);
		}
		// Test para casos raros
				@Test
				public void potenciaDeUnNumeroEnormeAUnNumeroEnorme() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					int base = Integer.MAX_VALUE;
					int exponente = Integer.MAX_VALUE;
					int esperado2 = Integer.MAX_VALUE;
					// 2. ACT (Ejecutar)
					int obtenido1 = pro.potencia(base, exponente);
					// 3. Assert (comprobar)
					assertEquals(esperado2, obtenido1);
				}
				// Test para casos raros
				@Test
				public void potenciaDeUnoAUnNumeroEnorme() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					int base = 1;
					int exponente = Integer.MAX_VALUE;
					int esperado2 = 1;
					// 2. ACT (Ejecutar)
					int obtenido1 = pro.potencia(base, exponente);
					// 3. Assert (comprobar)
					assertEquals(esperado2, obtenido1);
				}
				// Test para casos raros
				@Test
				public void potenciaDeUnNumeroDiminutoAUnNumeroEnorme() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					int base = Integer.MIN_VALUE;
					int exponente = Integer.MAX_VALUE;
					int esperado2 = Integer.MIN_VALUE;
					// 2. ACT (Ejecutar)
					int obtenido1 = pro.potencia(base, exponente);
					// 3. Assert (comprobar)
					assertEquals(esperado2, obtenido1);
				}
				// Test para casos raros
				@Test
				public void potenciaIndeterminadaCeroACero() { //No deberia dar un resultado, pero no puedo poner NaN en int.
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					int base = 0;
					int exponente = 0;
					int esperado2 =1;
					// 2. ACT (Ejecutar)
					int obtenido1 = pro.potencia(base, exponente);
					// 3. Assert (comprobar)
					assertEquals(esperado2, obtenido1);
				}
				// Test para casos raros
				@Test
				public void multiplicacionIndeterminadaCeroPorInfinito() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					double numReal1 = 0;
					double numReal2 = Double.POSITIVE_INFINITY;
					double esperado = Double.NaN;
					// 2. ACT (Ejecutar)
					double obtenido = pro.multiplicacionDosReales(numReal1, numReal2);
					// 3. Assert (comprobar)
					assertEquals(esperado, obtenido);
				}
				// Test para casos raros
				@Test
				public void multiplicacionNumeroPorInfinito() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					double numReal1 = 2;
					double numReal2 = Double.POSITIVE_INFINITY;
					double esperado = Double.POSITIVE_INFINITY;
					// 2. ACT (Ejecutar)
					double obtenido = pro.multiplicacionDosReales(numReal1, numReal2);
					// 3. Assert (comprobar)
					assertEquals(esperado, obtenido);
				}
				// Test para casos raros
				@Test
				public void multiplicacionNumeroPorMenosInfinito() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					double numReal1 = 2;
					double numReal2 = Double.NEGATIVE_INFINITY;
					double esperado = Double.NEGATIVE_INFINITY;
					// 2. ACT (Ejecutar)
					double obtenido = pro.multiplicacionDosReales(numReal1, numReal2);
					// 3. Assert (comprobar)
					assertEquals(esperado, obtenido);
				}
				// Test para casos raros
				@Test
				public void multiplicacionInfinitoPorMenosInfinito() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					double numReal1 = Double.POSITIVE_INFINITY;
					double numReal2 = Double.NEGATIVE_INFINITY;
					double esperado = Double.NEGATIVE_INFINITY;
					// 2. ACT (Ejecutar)
					double obtenido = pro.multiplicacionDosReales(numReal1, numReal2);
					// 3. Assert (comprobar)
					assertEquals(esperado, obtenido);
				}
				// Test para casos raros
				@Test
				public void multiplicacionCeroPorInfinitoPorInfinito() {
						// 1. ARRANGED (preparar)
					Producto pro = new Producto();
						double numReal1= Double.POSITIVE_INFINITY;
						double numReal2= Double.POSITIVE_INFINITY;
						double numReal3= 0;
						double esperado= Double.NaN;
						// 2. ACT (Ejecutar)
						double obtenido = pro.multiplicacionTresReales(numReal1, numReal2, numReal3);
						// 3. Assert (comprobar)
						assertEquals(esperado,obtenido);
				}		
				// Test para casos raros
				@Test
				public void multiplicacionNumeroPorNaN() {
					// 1. ARRANGED (preparar)
					Producto pro = new Producto();
					double numReal1 = 2;
					double numReal2 = Double.NaN;
					double esperado = Double.NaN;
					// 2. ACT (Ejecutar)
					double obtenido = pro.multiplicacionDosReales(numReal1, numReal2);
					// 3. Assert (comprobar)
					assertEquals(esperado, obtenido);
				}
}
