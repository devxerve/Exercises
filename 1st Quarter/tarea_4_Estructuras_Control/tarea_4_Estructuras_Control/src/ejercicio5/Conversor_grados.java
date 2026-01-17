package ejercicio5;
import java.util.Scanner;
public class Conversor_grados {
	static final float Conversor = 9F / 5F;
	static final int Inicial_int = 0;
	static final float Inicial_float = 0;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int decena = Inicial_int;
		float decena_f = Inicial_float;
		float conversion = Inicial_float;
		String separador = "----------------";
		
		System.out.println("Elige una decena entre 10 y 100 (incluidas)");
		decena = entrada.nextInt();		
		switch(decena) {
		case 10:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 20:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 30:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 40:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 50:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 60:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 70:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 80:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 90:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		case 100:
			decena_f = decena;
			conversion= ((decena_f * Conversor)+ 32F);
			System.out.println(decena + " grados celsius son "+ conversion + " grados farenheit");
			System.out.println(separador);
			System.out.println(conversion + " grados farenheit son " + decena + " grados celsius");
		break;
		default:
			System.out.println("El número esta fuera del rango (10-100)");
		}		
entrada.close();
	}

}
