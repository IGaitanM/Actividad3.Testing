
public class PruebaMetodos {

	public static void main(String[] args) {

		// Prueba m�todo Producto. Iv�n Gait�n Mu�oz
		Producto pro= new Producto ();
		System.out.println(pro.multiplicacionTresReales(1.5556, 2.668, 4.5565));
		
		// Prueba m�todo Suma. Carlos Ashley
		Suma suma1 = new Suma();
		System.out.println(suma1.sumaDosReales(5, 9));
		
		// Prueba m�todo Cociente. Miguel Vilanova
		Cociente coc = new Cociente();
		System.out.println(coc.dividirDosEnteros(100, 20));
		
		// Prueba m�todo Resta. Antonio Pastor
				Resta rest = new Resta();
				System.out.println(rest.restaDosEnteros(100, 50));
		//Prueba m�todo operaciones.Jonas Artieda
				Operaciones oper= new Operaciones();
				System.out.println(oper.numPrimo(87));
	}

}
