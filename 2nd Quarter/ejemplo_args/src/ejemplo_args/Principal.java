package ejemplo_args;

public class Principal {
public static void main(String[] args) {
	if(args.length < 2) {
		System.out.println("[MAIN] Se esperaban mas de 2 argumentos de entrada");
		System.exit(-3);
	}else {
		String nombre = args[0];
		String palabra = args[1];
		System.out.println(palabra + " " + nombre);
		System.out.println("Programa finalizado correctamente");
		System.exit(0);
	}
}
}