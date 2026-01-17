package ejercicio5_metodos;
import java.util.Scanner;
public class Potencia_recursiva {
	final static int INI_INT = 0;
		public static int potenciarecursiva(int base, int exponente) {
			int output = INI_INT;
			
			if (exponente ==0) {
				return output;
			}else {
				output = base*(base*(exponente-1));
				return output;
				}
		}

		public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int base, exponente;
		base = exponente = INI_INT;
		
			System.out.println("Introduce la base de la potencia");
			base = entrada.nextInt();
			System.out.println("Introduce el exponente de la potencia");
			exponente = entrada.nextInt();
		
			System.out.println("La potencia tiene como resultado " + potenciarecursiva(base,exponente));
		entrada.close();
	}
}

