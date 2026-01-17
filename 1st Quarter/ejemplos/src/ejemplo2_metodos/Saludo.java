package ejemplo2_metodos;
import java.util.Scanner;
public class Saludo {
	public static void saludo () {  //void no devuelve nada
		String nombre;
		Scanner entrada = new Scanner (System.in);
		boolean input = false;
		do {
			if(input == true) {
				System.out.println("Nombre no valido, introduce otro");
			}else {
				System.out.println("¿Cómo te llamas?");
				input = true;
			}
			nombre = entrada.nextLine();
		}while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+"));
		System.out.println("Hola " + nombre);
		entrada.close();
	}
	public static void main(String[] args) {
		saludo();
	}
}


