package paractica1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entrada=5;
		if(args.length>=1) {
			entrada= Integer.valueOf(args[0]);
			
		}
		//Calcular el factorial de entrada
		//El factorial de un numero es la multiplcacion por todos sus valores
		//!5=5*4*3*2*1
		for(int i=entrada -1;i>1;i--) {
			//entrada*=i;
			entrada=i*entrada;
			
		}
		
		System.out.println("El factorial es "+entrada);
		
	}

}
