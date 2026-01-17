package ejercicio3;
import java.util.Scanner;
public class Par_impar {

	public static void main(String[] args) {
		int entrada = 0;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		entrada = teclado.nextInt();
		
		if((entrada % 2) != 0) {
			System.out.println("El número es impar" + " (" + entrada + ")");
		}else {
			System.out.println("El número es par" + " (" + entrada + ")");
		}
		teclado.close();
	}

}
