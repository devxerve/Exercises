package ejercicio3;
import java.util.Scanner;
public class Perfiles_hierro {
	final static int Ini_int = 0;
	final static float Ini_float = 0F;
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int cantidad , aptas;
		cantidad = aptas = Ini_int; 
		float longitud = Ini_float;
		do {			
			System.out.println("Ingresa la cantidad de piezas que vas a registrar"); 
			cantidad = entrada.nextInt();
			if(cantidad <=0) { 
				System.out.println("Cantidad negativa, Ingresa la cantidad de piezas que vas a registrar"); 
			}
			} while(cantidad <=0);
		
		for(int contador = Ini_int; contador < cantidad; contador++) {
			do {
				System.out.println("Introduce la longitud de la pieza " + (contador+1) + "(entre 1,2 y 1,3 se considerara apta)");
				longitud = entrada.nextFloat();
				if(longitud < 0) {
					System.out.println("Longitud no valida, ingresa un número positivo");
					
				}
			}while(longitud <0);
			
			if((longitud >=1.2F) && (longitud <=1.3F)) {
				aptas++;
				}				
		}
		System.out.println("La cantidad de piezas aptas es " + aptas);
		entrada.close();
	}
}