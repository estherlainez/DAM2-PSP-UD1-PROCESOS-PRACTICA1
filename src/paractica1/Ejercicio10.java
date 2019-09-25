package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		File f=new File("./bin");
		System.out.println("Introduzca lo que desee");
		String cadena=teclado.nextLine();
		ProcessBuilder pb=new ProcessBuilder("java","paractica1.Ejercicio9",cadena);

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
