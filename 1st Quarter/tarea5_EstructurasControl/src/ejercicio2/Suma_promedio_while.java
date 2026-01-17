package ejercicio2;
import java.util.Scanner;
public class Suma_promedio_while {
	final static int Ini_int = 0;
	public static void main(String[] args) {
		int valor , input , suma, promedio;
		valor = input = suma = promedio = Ini_int;
		Scanner entrada = new Scanner (System.in);
		
		while(input<10) {
			input++;
			System.out.println("Introduce el valor número " + input);
			valor = entrada.nextInt();
			suma = suma + valor;
		};
		promedio = suma/input;
		System.out.println("La suma total de esos números es " + suma);
		System.out.println("El promedio total de esos números es " + promedio);
		entrada.close();
	}

}
