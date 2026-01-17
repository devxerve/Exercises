package ejemplo1_metodos;
import java.util.Scanner;

public class Sumar {
	static final int INI_INT = 0;
	public static int sumar(int numero1 , int numero2) {
		int suma = INI_INT;
		suma = numero1 + numero2;
		return suma;
	}
	public static void main(String[] args) {
		int n1, n2, suma;
		n1 = n2 = suma = INI_INT;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el valor 1");
		n1 = entrada.nextInt();
		System.out.println("Introduce el valor 1");
		n2 = entrada.nextInt();
		
		suma = sumar(n1,n2);
		System.out.println(suma);
		entrada.close();
	} 
	}
