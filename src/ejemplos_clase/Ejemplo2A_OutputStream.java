package ejemplos_clase;
import java.util.*;
public class Ejemplo2A_OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre=teclado.nextLine();
		System.out.println("Bienvenido "+nombre);
		
		teclado.close();

	}

}
