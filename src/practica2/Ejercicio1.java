package practica2;
import java.io.IOException;
import java.util.*;
public class Ejercicio1 {
/*
 * Crea un programa en Java que lea dos números desde la entrada estándar y visualice su suma.
 * Controlar que lo introducido por teclado sean dos números enteros, 
 * en caso contrario el programa debe finalizar con valor 1.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n1,n2;
		sumar(teclado);
		
		

	}
	
	public static void sumar(Scanner teclado) {
		try {
			System.out.println("Introduce numero 1");
			int nro1=teclado.nextInt();
			System.out.println("Introduce numero 2");
			int nro2=teclado.nextInt();
			int suma=nro1+nro2;
			System.out.println("La suma es "+suma);
			
		}catch(InputMismatchException e){
			e.getMessage();
			System.out.println("Error1");
			
		}
		
		
	}

}
