package ejercicio6;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Principal {
    private static void setCharset() {
	try {
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
}
public static String capitalize(String text){
    text = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
    return text;
}
 public static void main(String[] args) {
        String nombre_completo = null;
        String nombre = null;
        String apellido = null;
        String apellido2 = null;
        setCharset();
        Scanner entrada = new Scanner(System.in,"windows-1252");

        System.out.println("Introduce tu nombre completo (Nombre Apellido1 Apellido2 (opcional))");
        nombre_completo = entrada.nextLine().trim();

        System.out.println(nombre_completo);

        String[] partes = nombre_completo.split("\\s+");

        nombre = partes[0];
        nombre = capitalize(nombre);

        apellido = partes[1];
        apellido = capitalize(apellido);
        
        apellido2 = partes[2];
        apellido2 = capitalize(apellido2);

        System.out.println(apellido + " " + apellido2 + ", "+ nombre);

        entrada.close();
    }
}
