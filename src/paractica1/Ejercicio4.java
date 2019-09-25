package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		File f=new File("./bin");
		ProcessBuilder pb=new ProcessBuilder("java","paractica1.Ejercicio3","5");

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
			OutputStream os=p.getOutputStream();
			/*
			while((caracter=os.)!=-1) {
				
			}
			*/
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		}

}
