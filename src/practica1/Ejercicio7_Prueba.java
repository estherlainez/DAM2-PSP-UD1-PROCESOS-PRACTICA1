package practica1;

public class Ejercicio7_Prueba {
	/*
	 * Crea un programa en Java que admita argumentos desde main() y 
	 * devuelva con System.exit() los siguientes valores:
			Si el número de argumentos es <1 debe devolver 1
			Si el argumento es una cadena debe devolver 2
			Si el argumento es un número menor que 0 debe devolver 3
			En cualquier otro caso devolverá 0.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length<1) {//si es menor que 1
			System.out.println("menor que 1");
			System.exit(1);
		}
				
		if((args.length==1)&&(args[0] instanceof String)) {
			//Si es una cadena
			System.out.println("es una cadena");
			System.exit(2);
		}
		
		if((args.length==1)&&(args[0].charAt(0)=='-')&&(esNumero(args[0].charAt(1)))) {
			//Si es un numero menor que 0
			System.out.println("numero menor que 0");
			System.exit(3);
		}
		System.out.println("En otro caso");
		System.exit(0);//En cualquier otro caso		
	}
	
	
	
	public static boolean esNumero(char c) {
		String numeros="1234567890";
		if (numeros.indexOf(c)== -1) {
				return false;
		}
		return true;
	}	
	
}