package ejemplos_clase;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EjemploDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process p= new ProcessBuilder("CMD","/C","date").start();
			//Introducimos la informacion que el proceso espera recibir
			OutputStream os=p.getOutputStream();
			os.write("30-09-19".getBytes());
			os.flush();
			
			//leemos la salida
			InputStream is=p.getInputStream();
			int c=0;
			while((c=is.read())!=-1) {
				System.out.print((char)c);
				
			}
			is.close();
			//Comprobamos si la ejecucion ha sido correcta
			int exitVal=p.waitFor();
			System.out.println("Valor de salida "+exitVal);
			//En caso contrario mostramos el mensaje de error
			if(exitVal!=0) {
				InputStream er=p.getErrorStream();
				c=0;
				while((c=er.read())!=-1) {
					System.out.print((char)c);
				}
				er.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
