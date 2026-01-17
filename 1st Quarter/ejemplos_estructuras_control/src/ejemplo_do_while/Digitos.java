package ejemplo_do_while;
/*
 Programa Java que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de cuántos dígitos tiene el mismo. Finalizar el programa cuando se cargue el valor 0. 
 */
import java.util.Scanner;
public class Digitos {
	public static void main(String[] args) {
	//Zona de datos
		int numero = 0;
		Scanner teclado = new Scanner (System.in);
		String digitos = "cadena";
	//Zona de instrucciones
		do {
			System.out.println("Introduce un número entre 0 y 999");
			numero = teclado.nextInt();
						
			if(numero < 10) {
				digitos = "El numero tiene 1 digito";
			}else if(numero < 100) {
				digitos = "El numero tiene 2 digitos";
			}else {
				digitos = "El numero tiene 3 digitos";
			}
			System.out.println(digitos);
		}while((numero !=0) && (numero <= 999));	
			teclado.close();
		
	}
}
