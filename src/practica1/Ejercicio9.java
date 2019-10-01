package practica1;

public class Ejercicio9 {
/*
 * Crea un programa que visualice 5 veces la cadena que se le envía como parámetro del main().
 *  Si no se le envía ninguna cadena debe mostrar un mensaje indicandolo y finalizar el programa 
 *  como System.exit(1).

 */
	public static void main(String[] args) {
		
		if(args.length>0) {
			if(args[0].length()>0) {
				for(int i=0;i<5;i++) {
					System.out.println(args[0]);
				}
				
			}
			
		}else if(args.length==0) {
			System.out.println("Usted no introdujo ninguna cadena");
			System.exit(1);
		}
		
		
	}

}
