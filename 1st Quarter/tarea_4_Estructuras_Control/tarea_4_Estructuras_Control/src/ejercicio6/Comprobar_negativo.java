package ejercicio6;
import java.util.Scanner;
public class Comprobar_negativo {
	final static int ini_int = 0;
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int m, resta, n = ini_int;

		System.out.println("Introduce el primer valor");
		n = entrada.nextInt();
		do {
			System.out.print("\nIntroduce el segundo valor");
			m = entrada.nextInt();
			resta = n - m;
			System.out.print("\nEl resultado es " + resta);
			System.out.println();
			n = resta;
		}while(resta >=0);
		System.out.println("Bye");
		entrada.close();
	}
}
