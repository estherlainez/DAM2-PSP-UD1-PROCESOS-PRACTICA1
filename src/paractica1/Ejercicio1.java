package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/*
 * Crea un programa que invoque al comando Tree sobre la carpeta del proyecto y muestra su salida.

 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		File directorio=new File("C:\\Program Files (x86)");
		//le indicamos la forma de ejecutarlo, los parametros y el proceso
		ProcessBuilder p1= new ProcessBuilder("CMD","/C","Tree");
		Process p=null;
		//p1.directory(directorio);
		try {
			p=p1.start();
			InputStream is=p.getInputStream();
			int caracter;
			//imprimimos la salida caracter a caracter
			while((caracter=is.read())!=-1) {
				System.out.print((char)caracter);
			}
			is.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		//Comprobamos el valor de la salida o bien, -1 error
		try {
			int exitVal=p.waitFor();
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	

	}

}
