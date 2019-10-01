package ejemplos_clase;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejemplo2B_outputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File directorio= new File("./bin");
			ProcessBuilder pb=new ProcessBuilder("java","ejemplos_clase.Ejemplo2A_OutputStream");
			pb.directory(directorio);
			Process p=null;
			
			p=pb.start();
			OutputStream os=p.getOutputStream();
			os.write("Esther".getBytes());
			os.close();
			InputStream is=p.getInputStream();
			int c=0;
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}
			is.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
