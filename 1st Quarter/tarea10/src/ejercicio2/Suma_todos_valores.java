package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Suma_todos_valores {
	
	//CONSTANTES
	
		static final int INI_INT = 0;

	//METODOS

		public static int leerInt(Scanner entrada) {
			int output = INI_INT;
			try {
				output = entrada.nextInt();
			} catch (InputMismatchException ex) {
				output = INI_INT;
				entrada.next();
				System.out.println("Error, introduce solo números enteros, el programa terminara");
			}
			return output;
		}
		
		public static void rellenarArray(int[] array, int min, int max) {
			
			for (int i = 0; i < array.length; i++) {
				array[i] = generarNum(min, max);
			}
			
		}
				
		public static int generarNum(int min, int max) {
			int output = INI_INT;
			output = (int) (Math.random() * (max - min + 1) + min);
			return output;
		}
		
		public static void mostrarArray_suma(int[] array) {
			int suma = INI_INT;
			for (int i = 0; i < array.length; i++) {
				System.out.println("[" + i + "] = " + array[i]);
				suma += array[i];
			}
			System.out.println("La suma de los valores es = " + suma);
			
		}
	
	//MAIN
		public static void main(String[] args) {
			int tam = INI_INT;
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce un tamaño para el array");
			tam = leerInt(entrada);
			
			if(tam != INI_INT) {
				int[] arrayRandom = new int[tam];
				
				rellenarArray(arrayRandom,0,9);
				mostrarArray_suma(arrayRandom);
				System.out.println("Programa finalizado con exito");
			}else {
				System.out.println("Programa finalizado por tamaño invalido");
			}
			
			
			entrada.close();
		}





}

