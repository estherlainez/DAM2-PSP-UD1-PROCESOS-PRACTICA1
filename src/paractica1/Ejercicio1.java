package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		File directorio=new File("C:\\Program Files (x86)");
		
		ProcessBuilder p1= new ProcessBuilder("CMD","/C","Tree");
		Process p=null;
		p1.directory(directorio);
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
