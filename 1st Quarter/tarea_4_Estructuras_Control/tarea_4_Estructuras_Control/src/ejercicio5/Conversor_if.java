package ejercicio5;
import java.util.Scanner;
public class Conversor_if {
	static final float float_inicial = 0F;
	static final float conversor = 9F / 5F;
	public static void main(String[] args) {
		
		float numero = float_inicial;
		float conversion = float_inicial;
		String separador = "----------------";
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce una decena del 10 al 100");
		numero = entrada.nextInt();
		
		if((numero >= 10) && (numero <=100) && ((numero %10) == 0 )){
			conversion = ((numero*conversor)+32);
			System.out.println(numero + " Grados Celsius son " + conversion + " Grados Farenheit" );
			System.out.println(separador);
			System.out.println(conversion + " Grados Farenheit son " + numero + " Grados Celsius" );
		}else System.out.println("El número esta fuera del rango (10-100) o es una decena no valida");
		entrada.close();
	}
}
