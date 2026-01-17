package ejemplo1_metodos;
import java.util.Scanner;

public class Suma_compleja{
	static final int INI_INT = 0;
	
	public static int sumar () {
		Scanner entrada = new Scanner (System.in);
		int operandos = INI_INT;
		int sum =INI_INT;
		
		System.out.println("Introduce cuantos valores vas a sumar");
		operandos = entrada.nextInt();
		if(operandos == INI_INT) {
			System.out.println("No se pueden sumar " + operandos + " valores, vuelve a intentarlo");
		}
		for(int i = INI_INT; i < operandos; i++) {
			int num = INI_INT;
			System.out.println("Introduce el valor " + (i+1));
			num = entrada.nextInt();
			sum += num;
		}
		entrada.close();
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Programa para suma de valores a voluntad");
		int resultado = INI_INT;
		resultado =sumar();
		if (resultado !=INI_INT); {
			System.out.println("El resultado es " + resultado);
		}
		}
		
	}
