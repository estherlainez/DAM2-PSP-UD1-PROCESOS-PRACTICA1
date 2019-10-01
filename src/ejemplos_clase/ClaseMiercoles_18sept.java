package ejemplos_clase;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ClaseMiercoles_18sept {

	public static void main(String[] args) {
		//Creo el objeto File al directorio donde se encuentra
		File directorio=new File("C:\\Program Files (x86)");
		
		//Un proceso para ir al block de notas
		//ProcessBuilder pb= new ProcessBuilder("notepad");
		
		//Proceso para ir a cmd
		ProcessBuilder p1= new ProcessBuilder("CMD","/","DIR");
		
		//Para cambiar el directorio
		p1.directory(directorio);
		try {
			//Process p=pb.start();
			Process p=p1.start();
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
