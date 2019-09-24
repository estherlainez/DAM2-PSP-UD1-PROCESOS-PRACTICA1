package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ProcesoMuySencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dire=new File("./bin");
		
		ProcessBuilder pb=new ProcessBuilder("java","practica1.EjemploSencillo");
		pb.directory(dire);
		
		Process p=null;
		try {
			p=pb.start();
			InputStream is= p.getInputStream();
			
			int caracter;
			while((caracter=is.read())!=-1) {
				System.out.println((char)caracter);
			}
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
