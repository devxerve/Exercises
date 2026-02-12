package ejercicio7;
import java.util.Scanner;

public class Menu {
	final static int ini_int = 0;
	public static void main(String[] args) {
		int opcion = ini_int;
		String separador = "--------------------------";
		Scanner entrada = new Scanner (System.in);
		do {
			System.out.println("Introduce un valor del 1 al 4");
			System.out.println(separador);
			System.out.println("Opciones:");
			System.out.println("1 - Calcular horas");
			System.out.println("2 - Calcular mes");
			System.out.println("3 - Par o Impar");
			System.out.println("4 - Salir");
			opcion = entrada.nextInt();
			switch(opcion){
				case 1:
					int hora = ini_int;
					
					System.out.println("Introduce un número entre 0 y 24");
					hora = entrada.nextInt();
					if ((hora < ini_int) || (hora > 24)) {
						System.out.println("Número fuera del rango, no válido");
					} else if (hora <= 12) {
						System.out.println("Buenos días");
					} else if (hora < 21) {
						System.out.println("Buenas tardes");
					} else {
						System.out.println("Buenas noches");
					}
					System.out.println(separador);
				break;
					
				case 2:
					int mes = ini_int;
					System.out.println("Introduce un número del 1 al 12");
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
					System.out.println(separador);
				break;
				case 3:
					int numero = ini_int;
					
					System.out.println("Introduce un número");
					numero = entrada.nextInt();
					
					if((numero % 2) != 0) {
						System.out.println("El número es impar" + " (" + numero + ")");
					}else {
						System.out.println("El número es par" + " (" + numero + ")");
					}
					System.out.println(separador);
				break;
				case 4:
					System.out.println("BYE!!!!");
					break;
				default:
					System.out.println("Opción no encontrada, vuelve a intentarlo");
			}
		}while (opcion != 4);
		entrada.close();
	}
}
