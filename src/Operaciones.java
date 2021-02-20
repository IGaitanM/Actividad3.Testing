/**
	 * @author Jonas Artieda Medina
	 * clase para realizar diversas operaciones, comprobar si un numero es primo o no, 
	 * buscar el numero primo en una posicion X, calcular porcentajes y calcular factoriales.
	 * @since 27/01/2021
	 * @version 1.0
	 */
public class Operaciones {
	/**
	 * Metodo para comprobar si un número es primo.
	 * @param numero valor entero para hacer la operación.
	 * @return resultado devuelve si el numero es primo o no.
	 */
	public boolean numPrimo (int numero) {
		
		
		if (numero <1) 
			return false;
				
		int contador=0;
		
	for (int i= (int) Math.sqrt(numero); i>1; i--)
			if (numero%i==0)
				contador++; 
	return contador < 1;
		}	
	/**
	 * Método para obtener el i-ésimo número primo entero.
	 * @param numero valor entero para hacer la operación. Meter valores por encima de 0. 
	 * (Números muy altos incrementan el tiempo de la operación).
	 * @return resultado devuelve i-ésimo numero primo correspondiente al número metido.
	 */
	public int numIesimoPrimo(int numero) {
		

		int  contador=0;
		int contador2=0;
		 int contador3=0;
	 while (contador3 <numero) {
		 if (contador2 <=1) 
		            contador2++;
		 
		     contador=0;

	        for (int i= (int) Math.sqrt(contador2); i>1; i--) {
	            if (contador2%i==0)
		                contador++; 
		        }
		if (contador<1 && contador2!=1) 
				contador3++;
		
		       contador2++;
		       contador=0;
		 }
	
	return contador2-1; 
}
	/**
	 * Método obtener el porcentaje de dos números reales.
	 * @param numReal1 primer valor real para hacer la operación.
	 * @param numReal2 segundo valor real para hacer la operación.
	 * @return resultado devuelve el porcentaje del numero 1 respecto del número 2.
	 */
	public double porcentaje(double numReal1, double numReal2) {
		
		double resultado = (numReal1 * numReal2)/100;
		return resultado ;
		}
	/**
	 * Método obtener el factorial de un número.
	 * @param num sobre el que se obtiene el factorial. 
	 * (Números muy altos incrementan el tiempo de la operación). 
	 * No puede obtener factoriales de numeros negativos ni decimales.
	 * @return resultado devuelve el factorial del número.
	 */
	public int factorial(int num) {
		
		int resultado=1;
		for (int i=1; i<num+1; i++) {

			resultado = resultado * i ;
		}
				return resultado ;
		}
}
