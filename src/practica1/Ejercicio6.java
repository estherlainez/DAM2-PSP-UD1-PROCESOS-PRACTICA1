package practica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio6 {
/*
 * Crea un programa para ejecutar Ejercicio5. 
 * Muestra por pantalla el valor de salida comprobando 
 * tanto el caso correcto como el incorrecto.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("./bin");
		ProcessBuilder pb=new ProcessBuilder("java","practica1.Ejercicio5","Esther");

		pb.directory(f);
		
		Process p=null;
		
		try {
			p=pb.start();
			InputStream is=p.getInputStream();
			int caracter=0;
			
			while((caracter=is.read())!=-1) {
				System.out.print((char)caracter);
			}
			is.close();
			System.out.println(p.waitFor());
		}catch(IOException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
