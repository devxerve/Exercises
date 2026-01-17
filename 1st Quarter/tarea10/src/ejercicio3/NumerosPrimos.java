package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimos {
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
		
		public static int generarNum(int max, int min) {
			int output;
			output = (int) (Math.random() * (max - min + 1) + min);			
			return output;
		}
		
		public static boolean numPrimo(int num) {
			boolean primo = false;
			int divisores = INI_INT;
			for (int i = 1 ; i<=num; i++) {
					if(num % i == INI_INT) {
						divisores++;
					}
				}
			if(divisores == 2) {
				primo = true;
			}
			
			if ((num ==1)||(num==4)||(num==INI_INT)) {
				primo = false;
			}		
			return primo;
		}
		
		public static void rellenarArray(int[] array, int min, int max) {
			int num = generarNum(max,min);
			for (int i = INI_INT; i < array.length; i++) {
				do {
					num = generarNum(max,min);
				} while (!numPrimo(num));
				array[i] = num;
			}
		}
		
		public static void mostrarArray(int[] array) {
			for (int i = INI_INT; i < array.length; i++) {
				System.out.print("[" + i + "] = " + array[i]+ " | ");
			}
		}
		public static int numeroMayorArray(int[] array) {
			int mayor = array[0];
			
			for (int i = 0; i < array.length; i++) {
				if (array[i] > mayor) {
					mayor = array[i];
				} 
			}
			return mayor;
		}
		public static int posicionNumMayor(int array[],int num) {
			int output = INI_INT;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == num) {
					output = i;
				}
			}
			return output;
		}


	
	//MAIN
		
		public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			int tam, mayor, posicion;
			tam = mayor = posicion = INI_INT;
			System.out.println("Introduce un tamaño para el array");
			tam = leerInt(entrada);
			
			if (tam > INI_INT) {
				int[] array10 = new int[tam];
				System.out.println("Rellenando el array");
				rellenarArray(array10, 1, 100);
				System.out.println("Mostrando el array");
				mostrarArray(array10);
				System.out.println("\nMostrando el numero mayor");
				mayor= numeroMayorArray(array10);
				posicion = posicionNumMayor(array10,mayor);
				System.out.println("El numero mayor es " + mayor + " y esta en la posición [" + posicion + "]");
				System.out.println("Programa finalizado");
			}else {
				System.out.println("Programa finalizado por tamaño invalido");
			}
			entrada.close();
		}
}
