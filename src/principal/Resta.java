package principal;

/**
 * 
 * @author AntonioPastor // Equipo cucudrulu
 * @since 24/01/2021
 * @version 1.0
 * 
 */

public class Resta {
	public static int acumulado = 0;


/**
 * 1.  MÃ©todo @restaDosReales para restar dos numeros reales
 * @param numReal1 generamos un numero real
 * @param numReal2 generamos un numero real
 * @return nos devuelve la resta de los numeros reales
 * 
 * Si uno de los parámetros es infinito negativo el resultado es infinito positivo.
 * Si uno de los parámetros es infinito positivo el resultado es infinito positivo.
 * Si los dos parámetros son infinitos el resultado es NaN* (*Not a Number)
 * Si uno de los parámetros es NaN* el resultado es NaN*
 * 
 * 
 */
	public double restaDosReales(double numReal1, double numReal2) {
	
	double resultadoresta = numReal1 - numReal2;
			return resultadoresta;
	}

/**
 * 2.  MÃ©todo Resta numeros enteros @restaDosEnteros
 * 
 * @param numEnt1 introducimos un numero real
 * @param numEnt2 introducimos un numero real
 * @return La resta de los dos numeros reales
 * 
 * Si se realiza la resta con un numero negativo se produce una suma 
 * 
 */

	public int restaDosEnteros (int numEnt1, int numEnt2) {
	
	int resultadoresta = numEnt1- numEnt2;
			return resultadoresta;
	}

/**
 * 3. Restamos tres numeros reales @restaTresReales
 * 
 * @param numReal1 generamos un numero real
 * @param numReal2 generamos un numero real
 * @param numReal3 generamos un numero real
 * @return resultado de la resta
 */
	
	public double restaTresReales(double numReal1, double numReal2, double numReal3) {

		double resultadoresta = numReal1 - numReal2 - numReal3;
			return resultadoresta;
		}


/**
 * 4. MÃ©todo para acumular los valores introducidos @restaValoresMetidos
 * 
 * @param numLeido
 * @return Devuelve la resta de los numeros acumulados.
 * EL primero numero acumulado es negativo
 */
	
	public int restaValoresMetidos(int numLeido) {
			acumulado -= numLeido;

			return acumulado;
		}
	
}
