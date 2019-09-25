package paractica1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		if(args.length>0) {
			if(args[0].length()>0) {
				System.out.println(args[0]);
				System.exit(1);
			}
			
		}
			System.exit(-1);
		

	}
}
