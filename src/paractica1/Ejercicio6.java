package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("./bin");
		ProcessBuilder pb=new ProcessBuilder("java","paractica1.Ejercicio5");

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