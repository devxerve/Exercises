package ejercicio1;

import java.util.Scanner;
public class Despertador {
	public static void main(String[] args) {
		int hora = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entre 0 y 24");
		hora = teclado.nextInt();
		if ((hora < 0) || (hora > 24)) {
			System.out.println("Número fuera del rango, no válido");
		} else if (hora <= 12) {
			System.out.println("Buenos días");
		} else if (hora < 21) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}
		teclado.close();
	}
}