package practica1;

import java.io.IOException;

public class Ejercicio7 {
/*
 * Crea un programa en Java que admita argumentos desde main() y 
 * devuelva con System.exit() los siguientes valores:
		Si el número de argumentos es <1 debe devolver 1
		Si el argumento es una cadena debe devolver 2
		Si el argumento es un número menor que 0 debe devolver 3
		En cualquier otro caso devolverá 0.

 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<1) {
			System.exit(1);
		}else {
			boolean esCadena=false;
			try {
				Integer.valueOf(args[0]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				esCadena=true;
				System.out.println("c1");
			}
			try {
				Double.valueOf(args[0]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				esCadena=true;
				System.out.println("c2");
			}
			try {
				Float.valueOf(args[0]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				esCadena=true;
				System.out.println("c3");
			}
			if (esCadena==true) {
				System.exit(2);
			}
			if(Integer.valueOf(args[0])<0) {
			System.exit(3);
			}else {
				System.exit(0);
			}
		}

	}

}
