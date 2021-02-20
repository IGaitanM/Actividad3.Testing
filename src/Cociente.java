/**
 * Clase para realizar operaciones de cocientes. (Los resultados que den números reales periódicos solo devolverán 16 decimales.)
 * 
 * @author Miguel Vilanova - Equipocucudrulu
 * @since 24/01/2021
 * @version 1.0
 * 
 */

public class Cociente {
	/**
	 * Método para dividir dos números reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operación.
	 * @param numReal2 segundo valor real para hacer la operación que sea diferente a 0.

	 * @return resultado devuelve la división de los dos valores reales. 
	 */
	public double dividirDosReales(double numReal1, double numReal2) {

	double resultado = numReal1 / numReal2;
			return resultado ;
	}
	/**
	 * Método para dividir dos números enteros.
	 * 
	 * @param numEnt1 primer valor entero para hacer la operación.
	 * @param numEnt2 segundo valor entero para hacer la operación que sea diferente a 0.
	 * @return resultado devuelve la división de los dos valores enteros. (El resultado de la operación es redondeado a un entero).
	 */
	public int dividirDosEnteros(int numEnt1, int numEnt2) {

	int resultado = numEnt1 / numEnt2;
		return resultado ;
	}
	
	/**
	 * Método para obtener el inverso de un número real.
	 * 
	* @param num valor real para hacer la operación que sea diferente a 0.

	 * @return resultado devuelve el inverso del número real.
	 */

	public double inverso (double num) {
		
		 double resultado = (1/num);
				 
		return resultado;
	}

	/**
	 * Método para obtener la raíz de un número real.
	 * 
	 * @param num valor real para hacer la operación.
	 * @return resultado devuelve la raíz de un número real.
	 */

	public double raiz (double num) {
				 
		double resultado = Math.sqrt(num);
				 
		return resultado;
	}
	
}
