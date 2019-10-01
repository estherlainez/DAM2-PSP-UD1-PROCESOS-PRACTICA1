package practica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio8 {
/*
 * Realiza un programa para ejecutar Ejercicio7 y ejecutalo comprobando que 
 * el código de salida es correcto en todos los casos.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("./bin");
		ProcessBuilder pb=new ProcessBuilder("java","practica1.Ejercicio7","5");

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
			e.printStackTrace();
		}
		
		   
	    // Comprobar si el proceso ha finalizado de forma correcta
		
	    int valorSalida;
	    
	    try {
	    	valorSalida = p.waitFor();
	    	System.out.println("Valor de salida: " + valorSalida);
	    }catch(InterruptedException e) {
			e.printStackTrace();
		}
	   
   	
	}

}
