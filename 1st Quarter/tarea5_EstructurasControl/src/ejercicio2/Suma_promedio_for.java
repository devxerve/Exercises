package ejercicio2;
import java.util.Scanner;
	public class Suma_promedio_for {
		final static int Ini_int = 0;
		public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			int valor, suma , promedio;
			valor = suma = promedio = Ini_int;
			for(int input = 1; input <= 10; input++) {
				System.out.println("Introduce el número " + input);
				valor = entrada.nextInt();
				suma = suma + valor;			
			};
			promedio =suma/10;
			System.out.println("La suma total de esos números es " + suma);
			System.out.println("El promedio total de esos números es " + promedio);
			entrada.close();	
		}
}
