package practica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio5 {
/*
 * Crea un programa que reciba desde los argumentos del Main() un nombre y lo visualice en pantalla. 
 * Utiliza System.exit(1) para una finalización correcta y 
 * System.exit(-1) para el caso de que no se hayan introducido argumentos correctos en el main.

 */
	public static void main(String[] args) {
		
		if(args.length>0) {
			if(args[0].length()>0) {
				System.out.println(args[0]);
				System.exit(1);
			}
			
		}
			System.exit(-1);
		

	}
}
