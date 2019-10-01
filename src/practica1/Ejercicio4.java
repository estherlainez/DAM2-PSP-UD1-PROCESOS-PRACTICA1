package practica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*
;public class Ejercicio4 {
/*
 * Crea un programa que, ejecutando Ejercicio3, nos calcule el el cuadrado del
 *  factorial de un número dado por teclado.
 */
	public static void main(String[] args) {
		
		File f=new File("./bin");
		ProcessBuilder pb=new ProcessBuilder("java","practica1.Ejercicio3","5");

		pb.directory(f);
		
		Process p=null;
		
		try {
			p=pb.start();
			InputStream is=p.getInputStream();
			int caracter;
			
			while((caracter=is.read())!=-1) {
				System.out.print((char)caracter);
			}
			is.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		}

}
