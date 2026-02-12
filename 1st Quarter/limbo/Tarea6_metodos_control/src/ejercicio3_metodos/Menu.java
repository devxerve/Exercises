package ejercicio3_metodos;
import java.util.Scanner;
public class Menu {
	static final int INI_INT = 0;
	public static int opcion(Scanner entrada) {
		System.out.println("Selecciona una de las siguientes opciones");
		System.out.println(" 1) Calcular hora \n 2) Calcular mes \n 3) Par o impar \n 4) Salir");
		int output= entrada.nextInt();
		return output;
	}
	
	public static void hora(Scanner entrada) {
		int hora = INI_INT;
		System.out.println("Introduce un número entre 0 y 24");
		hora = entrada.nextInt();
		if ((hora < INI_INT) || (hora > 24)) {
			System.out.println("Número fuera del rango, no válido");
		} else if (hora <= 12) {
			System.out.println("Buenos días");
		} else if (hora < 21) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}
	}
	
	public static void mes(Scanner entrada) {
		System.out.println("Introduce un número del 1 al 12");
		int mes = INI_INT;
		mes = entrada.nextInt();	
		switch (mes) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Número fuera de rango (1-12), MES INVALIDO");
		};
	}

	public static boolean par(Scanner entrada) {
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		boolean output;
		if((num %2) == 0) {
			output = true;
		}else output = false;
		return output;
		
	}
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int eleccion = INI_INT;
		do {
			eleccion = opcion(entrada);
			switch (eleccion) {
			case 1:
				hora(entrada);
				break;
			case 2: 
				mes(entrada);
				break;
			case 3: 
			boolean par= par(entrada);
			if (par == true) {
				System.out.println("El número es par");
			}else System.out.println("El número es impar");
			break;
			default:
				System.out.println("Opcion no valida, vuelve a intentarlo");
				break;
			}
		}while ((eleccion >0) &&( eleccion < 4));
	entrada.close();
	}
	
	
}
