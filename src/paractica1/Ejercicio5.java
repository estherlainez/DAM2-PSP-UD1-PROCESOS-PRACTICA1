package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio5 {

	public static void main(String[] args) {
		String nombre="Esther";
		if(args.length>=1) {
			System.out.println("Esther");
			
		}
		
		File f=new File("./bin");
		ProcessBuilder pb=new ProcessBuilder("java","practica1.Ejercicio5");

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
		//Comprobamos el valor de la salida o bien, -1 error
		try {
			int exitVal=p.waitFor();//Recoge la salida de System.exit
			System.out.println("La ejecucion de salida es:"+exitVal);
			System.exit(1);
		} catch(InterruptedException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		

	}
}
