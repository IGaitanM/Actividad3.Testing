/**
	 * Clase 1: Suma. Esta clase implementa todos los m�todos que est�n relacionados con la sumas de la calculadora.
	 * 
	 * @author Carlos_Ashley
	 * @since 24/01/2021
	 * @version 1.0
	 *
	 */

public class Suma {
	
	public static int acumulado = 0;
	
	/**
	 * M�todo para sumar dos n�meros reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operci�n.
	 * @param numReal2 segundo valor real para hacer la operaci�n.
	 * @return resultado devuelve la suma de los dos valores reales.
	 */
	
	public double sumaDosReales(double numReal1, double numReal2) {

		double resultado = numReal1 + numReal2;
				return resultado ;
				
	}
	
	/**
	 * M�todo para sumar dos n�meros enteros.
	 * 
	 * @param numReal1 primer valor real para hacer la operci�n.
	 * @param numReal2 segundo valor real para hacer la operaci�n.
	 * @return resultado devuelve la suma de los dos valores enteros.
	 */
	
	public int sumaDosEnteros (int numEnt1, int numEnt2) {

		int resultado = numEnt1+ numEnt2;
				return resultado ;
				
	}
	
	/**
	 * M�todo para sumar tres n�meros reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operci�n.
	 * @param numReal2 segundo valor real para hacer la operaci�n
	 * @param numReal3 tercer valor real para hacer la operaci�n
	 * @return resultado devuelve la suma de los tres valores reales.
	 */
	
	public double sumaTresReales(double numReal1, double numReal2, double numReal3) {

		double resultado = numReal1 + numReal2 + numReal3;
				return resultado ;
				
	}
	
	/**
	 * M�todo para sumar valor acumulado.
	 * 
	 * @param numleido con valor entero para hacer la operci�n.
	 * @return acumulado devuelve el valor acumulado de las sumas.
	 */
	
	public int sumaValoresMetidos(int numLeido) {
		acumulado += numLeido;

		return acumulado;
}
		
}