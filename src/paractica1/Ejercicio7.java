package paractica1;

import java.io.IOException;

public class Ejercicio7 {
/*
 * Crea un programa en Java que admita argumentos desde main() y 
 * devuelva con System.exit() los siguientes valores:
		Si el número de argumentos es <1 debe devolver 1
		Si el argumento es una cadena debe devolver 2
		Si el argumento es un número menor que 0 debe devolver 3
		En cualquier otro caso devolverá 0.

 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		boolean esCadena=true;
		/*
		if(args.length>0) {
			if(args[0].length()<1) {
				System.out.println(args[0]);
				System.exit(1);
			}
		if(args[0].length()<0) {
				System.exit(3);
			}
		}
		*/
		  if (args.length < 1) { //si hay más de 1 parámetro
			  if(args[0].length()<1) {
					System.out.println(args[0]);
					System.exit(1);
				}
	        } else if (args.length < 0){//si hay mas de 0
	        	if(args[0].length()<1) {
					System.out.println(args[0]);
					System.exit(3);
				}
	        }else {
	        	System.exit(0);
	        }
		
		  try{
			  Integer.valueOf(args[0]);
			  
			    
			}catch(NumberFormatException e){
			     e.getStackTrace();
			}
		
		
	}

}
