package ejercicio4_metodos;
import java.util.Scanner;
public class Menu {
	static final int INI_INT = 0;
	static final float INI_FLOAT = 0F;
	static Scanner entrada = new Scanner (System.in);
	
	public static void sumar (){
		int cantidad = INI_INT;
		float num, suma;
		num = suma = INI_FLOAT;
		System.out.println("¿Cuantos números quieres sumar?");
		
		cantidad = entrada.nextInt();
		for(int contador = INI_INT; contador < cantidad; contador++){
			System.out.println("Introduce el número " + (contador + 1 ));
			num = entrada.nextFloat();
			
			if (contador != INI_INT){
				suma += num;
			}
		}
		System.out.println("El resultado de la suma es " + suma);
		System.out.println("BYEEEEE!!!!!");
	}
	
	public static void restar() {
		int cantidad = INI_INT;
		float num, resta;
		num = resta = INI_FLOAT;
		System.out.println("¿Cuantos números quieres restar?");
		
		cantidad = entrada.nextInt();
		for(int contador = INI_INT; contador < cantidad; contador++){
			System.out.println("Introduce el número " + (contador + 1 ));
			num = entrada.nextFloat();
			if(contador == INI_INT) {
				resta = num;
			}
			
			if (contador != INI_INT){
				resta -= num;
			}
		}
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("BYEEEEE!!!!!");
	}
	
	public static void multiplicar() {
		int cantidad = INI_INT;
		float num, multip;
		num = multip = INI_FLOAT;
		System.out.println("¿Cuantos números quieres multiplicar?");
		
		cantidad = entrada.nextInt();
		for(int contador = INI_INT; contador < cantidad; contador++){
			System.out.println("Introduce el número " + (contador + 1 ));
			num = entrada.nextFloat();
			if(contador ==INI_INT) {
				multip = num;
			}
			if (contador != INI_INT){
				multip *=num;
			}
		}
		System.out.println("El resultado de la multiplicación es " + multip);
		System.out.println("BYEEEEE!!!!!");
	}

	public static void dividir() {
		int cantidad = INI_INT;
		float num, divi;
		num = divi = INI_FLOAT;
		System.out.println("¿Cuantos números quieres dividir?");
		
		cantidad = entrada.nextInt();
		for(int contador = INI_INT; contador < cantidad; contador++){
			System.out.println("Introduce el número " + (contador + 1 ));
			num = entrada.nextFloat();
			if(contador ==INI_INT) {
				divi = num;
			}
			if ((contador != INI_INT)&&(num != INI_INT)){
				divi /=num;
			}else if (contador != INI_INT){
				System.out.println("No se puede dividir por 0, vuelve a intentarlo");
				contador--;
			}
		}
		System.out.println("El resultado de la división es " + divi);
		System.out.println("BYEEEEE!!!!!");
	}
	
	public static void cuadrado() {
		float base,cuadrado;
		base = cuadrado = INI_FLOAT;
		System.out.println("Introduce el numero que quieres elevar al cuadrado");
		base = entrada.nextFloat();
		cuadrado = base*base;
		System.out.println("El resultado de la potencia es " + (int)cuadrado);
		System.out.println("BYEEEEE!!!!!");
	}
	
	
	
	public static void main(String[] args) {
		int opcion;
		opcion = INI_INT;
		
		do {
			System.out.println("Seleccione una de las siguientes opciones");
			System.out.println("1 Sumar \n2 Restar \n3 Multiplicar \n4 Dividir \n5 Cuadrado \n6 Salir");
			opcion = entrada.nextInt();
			
			switch (opcion) {
				case 1: {
					sumar();
					break;
				}
				case 2: {
					restar();
					break;
				}
				case 3: {
					multiplicar();
					break;
				}
				case 4: {
					dividir();
					break;
				}
				case 5: {
					cuadrado();
					break;
				}
				case 6: {
					System.out.println("BYEEEE!!!!");
					break;
				}
				default: {
					System.out.println("Número no valido, introduce un número del 1 al 6");
					break;
				}
			};
		} while (opcion !=6);	
	}
}
