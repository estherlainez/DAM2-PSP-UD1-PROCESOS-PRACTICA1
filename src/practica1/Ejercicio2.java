package practica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio2 {
/*
 * Partiendo del código anterior, crea un programa que muestre el árbol de carpetas
 *  del directorio del proyecto y el contenido de cada una de ellas.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File directorio=new File("C:/Users/ifc/git/DAM2-PSP-UD1-PROCESOS-PRACTICA1/src");
		File directorio1=new File("C:/Users/MSI/git/DAM2-PSP-UD1-PROCESOS-PRACTICA1/src");
		ProcessBuilder p1= new ProcessBuilder("CMD","/C","Tree","/F");
		Process p=null;
		//p1.directory(directorio);
		p1.directory(directorio1);
		try {
			p=p1.start();
			InputStream is=p.getInputStream();
			int caracter;
			
			while((caracter=is.read())!=-1) {
				System.out.print((char)caracter);
			}
			is.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			int exitVal=p.waitFor();
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	
		
	}

}
