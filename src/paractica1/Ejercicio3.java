package paractica1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca numero ");
		int numero=teclado.nextInt();
		int resultado=factorial(numero);
		System.out.println("El factorial de "+ numero +" = " +resultado);

	}

public static int factorial(int n) {
		
		int r;
		if (n==0) {
			return r = 1;
		}else {
			return r=n * factorial(n-1);
			}
		
		
	}
}
