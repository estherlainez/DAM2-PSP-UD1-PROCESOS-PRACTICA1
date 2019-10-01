package practica2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("./bin");
		
		ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio1");

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
			
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		

	}

}
