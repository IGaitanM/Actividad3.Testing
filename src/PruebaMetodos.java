
public class PruebaMetodos {

	public static void main(String[] args) {

		// Prueba método Producto. Iván Gaitán Muñoz
		Producto pro= new Producto ();
		System.out.println(pro.multiplicacionTresReales(1.5556, 2.668, 4.5565));
		
		// Prueba método Suma. Carlos Ashley
		Suma suma1 = new Suma();
		System.out.println(suma1.sumaDosReales(5, 9));
		
		// Prueba método Cociente. Miguel Vilanova
		Cociente coc = new Cociente();
		System.out.println(coc.dividirDosEnteros(100, 20));
		
		// Prueba método Resta. Antonio Pastor
				Resta rest = new Resta();
				System.out.println(rest.restaDosEnteros(100, 50));
		//Prueba método operaciones.Jonas Artieda
				Operaciones oper= new Operaciones();
				System.out.println(oper.numPrimo(87));
	}

}
