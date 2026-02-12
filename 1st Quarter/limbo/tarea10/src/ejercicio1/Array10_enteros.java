package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array10_enteros {
	
//METODOS
	
	static final int INI_INT = 0;

	public static int leerInt(Scanner entrada) {
		int output = INI_INT;
		try {
			output = entrada.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Entrada no valida, se esperaba un número entero, el programa termina");
			entrada.next();
		}
		return output;
	}
	
	public static void rellenarArray(int[] array, Scanner entrada) {
		for (int i = INI_INT; i < array.length; i++) {
			System.out.println("Introduce el valor [" + i + "]");
			array[i] = leerInt(entrada);
		}
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + i  + "] = "+ array[i] + " | ");
		}
	}
//MAIN
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int[] array10 = new int[10];
		
		rellenarArray(array10, entrada);
		mostrarArray(array10);
	}

}
