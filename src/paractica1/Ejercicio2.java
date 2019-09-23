package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo el objeto File
		File directorio= new File(".\\bin");
		//creo ek ProcessBuilder con el proceso a ejecutar
		ProcessBuilder p=new ProcessBuilder("java","ejemplos_clase.Ejercicio2");
		//Establezco el directorio donde se encuentra el proceso
		p.directory(directorio);
		
		System.out.println("Directorio: "+p.directory());
		
		//Ejecuto el proceso
		Process pc=null;
		try {
			pc=p.start();
			
			InputStream a=pc.getInputStream();
			
			int b;
			while((b=a.read())!=-1) {
				System.out.print((char)b);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//con list visualizo los archivos
		String ruta="src";
		File f=new File(ruta);
		
		String[]arbol=f.list();
		
		for(int i=0;i<arbol.length;i++) {
			System.out.println(arbol[i]);
			File f1=new File(f.getPath(),arbol[i]);
			
			if(f1.isDirectory()) {
				String []contenido=f1.list();
				
				for(int j=0;j<contenido.length;j++) {
					
					System.out.println(" "+contenido[j]);
				}
			}
		}

	}

}
