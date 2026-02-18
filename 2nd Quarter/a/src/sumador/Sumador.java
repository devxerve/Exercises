package sumador;

import java.util.Arrays;

public class Sumador {
	private int numero1;
	private int numero2;
	
	public Sumador(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int sumar () {
		int resultado = 0;
		for (int i=this.numero1; i<=this.numero2; i++)
			resultado += i;
		return resultado;
	}

	public static void main(String[] args) {
		// n1 y n2 se construyen desde 
		// que reciba como argumentos de entrada los números a sumar.
		System.out.println("[Sumador] Argumentos de entrada:" + Arrays.toString(args));
		
		// Control de argumentos de entrada: son dos
		if (args.length < 2) {
			System.err.println("Faltan argumentos de entrada");
			System.exit(-2);
		}
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		System.out.println("[Sumador] Enteros a sumar: [" + n1 + "] y [" + n2 + "]");
		
		// Crear un objeto Sumador y llamar a su método sumar
		Sumador sumador = new Sumador(n1, n2);
		System.out.println("[Sumador] La suma es: " + sumador.sumar());
		System.out.println("[Sumador] Finalizado");
		
		
	}
	
	
}
