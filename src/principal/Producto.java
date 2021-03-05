package principal;
/**
 * Clase de la calculadora para realizar operaciones de multiplicaci�n.
 * 
 * @author Iv�n Gait�n Mu�oz
 * @since 24/01/2021
 * @version 1.0
 * 
 */
public class Producto {

	/**
	 * M�todo para multiplicar dos n�meros reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operaci�n.
	 * @param numReal2 segundo valor real para hacer la operaci�n.
	 * @return resultado devuelve la multiplicacion de los dos valores reales.<ul>
	 * CASOS RAROS:
	 * <ul>
	 * <li> Si un par�metro es NaN el resultado ser� NaN.
	 * <li> Si multiplicamos dos infinitos positivos el resultado ser� NaN.
	 * <li> Si multiplicamos infinito positivo por infinito negativo, el resultado ser� infinito negativo
	 * <li> La multiplicaci�n entre un n�mero normal y un infinito negativo dar� como resultado infinito negativo.
	 * <li> Multiplicar 0 por NaN dar� como resultado NaN.
	 * <ul>
	 */

	public double multiplicacionDosReales(double numReal1, double numReal2) {

		double resultado = numReal1 * numReal2;
		return resultado;
	}
	
	/**
	 * M�todo para multiplicar dos n�meros enteros.
	 * 
	 * @param numEnt1 primer valor real para hacer la operaci�n.
	 * @param numEnt2 segundo valor real para hacer la operaci�n.
	 * @return resultado devuelve la multiplicacion de los dos valores reales.<ul>
	 * * CASOS RAROS:
	 * <ul>
	 * <li> Si un par�metro es NaN el resultado ser� NaN.
	 * <li> Si multiplicamos dos infinitos positivos el resultado ser� NaN.
	 * <li> Si multiplicamos infinito positivo por infinito negativo, el resultado ser� infinito negativo
	 * <li> La multiplicaci�n entre un n�mero normal y un infinito negativo dar� como resultado infinito negativo.
	 * <li> Multiplicar 0 por NaN dar� como resultado NaN.
	 * <ul>
	 *
	 */
	public int multiplicacionDosEnteros(int numEnt1, int numEnt2) {

		int resultado = numEnt1 * numEnt2;
		return resultado;

	}
	
	/**
	 * M�todo para multiplicar tres n�meros reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operaci�n.
	 * @param numReal2 segundo valor real para hacer la operaci�n.
	 * @param numReal3 tercer valor real para hacer la operaci�n.
	 * @return resultado devuelve la multiplicacion de los tres valores reales.<ul>
	 * CASOS RAROS:
	 * <ul>
	 * <li> Si un par�metro es NaN el resultado ser� NaN.
	 * <li> Si se usan dos par�metros infinitos positivos el resultado ser� NaN.
	 * <li> Si multiplicamos infinito positivo por infinito negativo, el resultado ser� infinito negativo.
	 * <li> La multiplicaci�n entre dos n�meros normales y un infinito negativo dar� como resultado infinito negativo.
	 * <li> Multiplicar 0 por NaN dar� como resultado NaN.
	 * <ul>
	 */
	public double multiplicacionTresReales(double numReal1, double numReal2, double numReal3) {

		double resultadomultiplicacion = numReal1 * numReal2 * numReal3;
		return resultadomultiplicacion;

	}
	
	/**
	 * M�todo para calcular una potencia.
	 * @param base valor de la base de la pontencia a calcular.
	 * @param exponente valor del exponente de la potencia a calcular.
	 * @return resultado devuelve el resultado de la potencia.<ul>
	 * *  CASOS RAROS:
	 * <ul>
	 * <li> Usar 0 de base dara de resultado 0
	 * <li> Usar 0 de base y 0 de exponente dar� NaN
	 * <li> Usar 0 de exponente dar� como resultado NaN
	 * <li> Si la base es MIN_VALUE y el Exponente MAX_VALUE el resultado es MIN_VALUE
	 * <li> Si la base es 1 y el exponente MAX_VALUE, el resultado es 1 
	 * <li> Usar un numero negativo en el exponente dar� como resultado NaN
	 * <li> La potencia de exponente un n�mero negativo dar� de resultado NaN
	 * <ul>
	 */

	public int potencia(int base, int exponente) {

		int resultado = (int) Math.pow(base, exponente);

		return resultado;
	}

	
}	