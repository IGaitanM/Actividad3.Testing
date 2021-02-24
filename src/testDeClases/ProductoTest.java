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
			double esperado = 10.3;
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
			int numEnt2 = 333;
			int esperado = 888;
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
				double esperado= 33.53;
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

}
