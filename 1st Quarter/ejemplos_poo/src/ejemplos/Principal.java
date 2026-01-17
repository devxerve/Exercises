package ejemplos;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Perro perro1 = new Perro("Mastín", "Grande", -3, "Blanco" );
		perro1.ladrar();
		perro1.dormir();
		System.out.println(perro1.getInfo());
		
		entrada.close();
		
	}
}
