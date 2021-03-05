package principal;
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
	 * @return resultado devuelve la multiplicacion de los dos valores reales.<ul>
	 * CASOS RAROS:
	 * <ul>
	 * <li> Si un parámetro es NaN el resultado será NaN.
	 * <li> Si multiplicamos dos infinitos positivos el resultado será NaN.
	 * <li> Si multiplicamos infinito positivo por infinito negativo, el resultado será infinito negativo
	 * <li> La multiplicación entre un número normal y un infinito negativo dará como resultado infinito negativo.
	 * <li> Multiplicar 0 por NaN dará como resultado NaN.
	 * <ul>
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
	 * @return resultado devuelve la multiplicacion de los dos valores reales.<ul>
	 * * CASOS RAROS:
	 * <ul>
	 * <li> Si un parámetro es NaN el resultado será NaN.
	 * <li> Si multiplicamos dos infinitos positivos el resultado será NaN.
	 * <li> Si multiplicamos infinito positivo por infinito negativo, el resultado será infinito negativo
	 * <li> La multiplicación entre un número normal y un infinito negativo dará como resultado infinito negativo.
	 * <li> Multiplicar 0 por NaN dará como resultado NaN.
	 * <ul>
	 *
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
	 * @return resultado devuelve la multiplicacion de los tres valores reales.<ul>
	 * CASOS RAROS:
	 * <ul>
	 * <li> Si un parámetro es NaN el resultado será NaN.
	 * <li> Si se usan dos parámetros infinitos positivos el resultado será NaN.
	 * <li> Si multiplicamos infinito positivo por infinito negativo, el resultado será infinito negativo.
	 * <li> La multiplicación entre dos números normales y un infinito negativo dará como resultado infinito negativo.
	 * <li> Multiplicar 0 por NaN dará como resultado NaN.
	 * <ul>
	 */
	public double multiplicacionTresReales(double numReal1, double numReal2, double numReal3) {

		double resultadomultiplicacion = numReal1 * numReal2 * numReal3;
		return resultadomultiplicacion;

	}
	
	/**
	 * Método para calcular una potencia.
	 * @param base valor de la base de la pontencia a calcular.
	 * @param exponente valor del exponente de la potencia a calcular.
	 * @return resultado devuelve el resultado de la potencia.<ul>
	 * *  CASOS RAROS:
	 * <ul>
	 * <li> Usar 0 de base dara de resultado 0
	 * <li> Usar 0 de base y 0 de exponente dará NaN
	 * <li> Usar 0 de exponente dará como resultado NaN
	 * <li> Si la base es MIN_VALUE y el Exponente MAX_VALUE el resultado es MIN_VALUE
	 * <li> Si la base es 1 y el exponente MAX_VALUE, el resultado es 1 
	 * <li> Usar un numero negativo en el exponente dará como resultado NaN
	 * <li> La potencia de exponente un número negativo dará de resultado NaN
	 * <ul>
	 */

	public int potencia(int base, int exponente) {

		int resultado = (int) Math.pow(base, exponente);

		return resultado;
	}

	
}	