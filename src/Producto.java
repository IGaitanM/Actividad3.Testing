/**
 * Clase de la calculadora para realizar operaciones de multiplicación.
 * 
 * @author Iván Gaitán Muñoz
 * @since 24/01/2021
 * @version 1.0
 * 
 */
public class Producto {

	/**
	 * Método para multiplicar dos números reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operación.
	 * @param numReal2 segundo valor real para hacer la operación.
	 * @return resultado devuelve la multiplicacion de los dos valores reales.
	 */

	public double multiplicacionDosReales(double numReal1, double numReal2) {

		double resultado = numReal1 * numReal2;
		return resultado;
	}
	
	/**
	 * Método para multiplicar dos números enteros.
	 * 
	 * @param numEnt1 primer valor real para hacer la operación.
	 * @param numEnt2 segundo valor real para hacer la operación.
	 * @return resultado devuelve la multiplicacion de los dos valores reales.
	 */
	public int multiplicacionDosEnteros(int numEnt1, int numEnt2) {

		int resultado = numEnt1 * numEnt2;
		return resultado;

	}
	
	/**
	 * Método para multiplicar tres números reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operación.
	 * @param numReal2 segundo valor real para hacer la operación.
	 * @param numReal3 tercer valor real para hacer la operación.
	 * @return resultado devuelve la multiplicacion de los tres valores reales.
	 */
	public double multiplicacionTresReales(double numReal1, double numReal2, double numReal3) {

		double resultadomultiplicacion = numReal1 * numReal2 * numReal3;
		return resultadomultiplicacion;

	}
	
	/**
	 * Método para calcular una potencia.
	 * 
	 * @param base valor de la base de la pontencia a calcular.
	 * @param exponente valor del exponente de la potencia a calcular.
	 * @return resultado devuelve el resultado de la potencia.
	 */

	public int potencia(int base, int exponente) {

		int resultado = (int) Math.pow(base, exponente);

		return resultado;
	}

	
}	