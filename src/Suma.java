/**
	 * Clase 1: Suma. Esta clase implementa todos los métodos que están relacionados con la sumas de la calculadora.
	 * 
	 * @author Carlos_Ashley
	 * @since 24/01/2021
	 * @version 1.0
	 *
	 */

public class Suma {
	
	public static int acumulado = 0;
	
	/**
	 * Método para sumar dos números reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operción.
	 * @param numReal2 segundo valor real para hacer la operación.
	 * @return resultado devuelve la suma de los dos valores reales.
	 */
	
	public double sumaDosReales(double numReal1, double numReal2) {

		double resultado = numReal1 + numReal2;
				return resultado ;
				
	}
	
	/**
	 * Método para sumar dos números enteros.
	 * 
	 * @param numReal1 primer valor real para hacer la operción.
	 * @param numReal2 segundo valor real para hacer la operación.
	 * @return resultado devuelve la suma de los dos valores enteros.
	 */
	
	public int sumaDosEnteros (int numEnt1, int numEnt2) {

		int resultado = numEnt1+ numEnt2;
				return resultado ;
				
	}
	
	/**
	 * Método para sumar tres números reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operción.
	 * @param numReal2 segundo valor real para hacer la operación
	 * @param numReal3 tercer valor real para hacer la operación
	 * @return resultado devuelve la suma de los tres valores reales.
	 */
	
	public double sumaTresReales(double numReal1, double numReal2, double numReal3) {

		double resultado = numReal1 + numReal2 + numReal3;
				return resultado ;
				
	}
	
	/**
	 * Método para sumar valor acumulado.
	 * 
	 * @param numleido con valor entero para hacer la operción.
	 * @return acumulado devuelve el valor acumulado de las sumas.
	 */
	
	public int sumaValoresMetidos(int numLeido) {
		acumulado += numLeido;

		return acumulado;
}
		
}