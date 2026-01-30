package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
 public static void main(String[] args) {
        String nombre_completo = null;
        String nombre = null;
        String apellido = null;
        String apellido2 = null;
        
        Scanner entrada = new Scanner(System.in,"windows-1252");

        System.out.println("Introduce tu nombre completo (Nombre Apellido1 Apellido2 (opcional))");
        nombre_completo = entrada.nextLine().trim();

        System.out.println(nombre_completo);

        String[] partes = nombre_completo.split("\\s+");

        nombre = partes[0];
        nombre = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();

        apellido = partes[1];
        apellido = apellido.substring(0,1).toUpperCase() + apellido.substring(1).toLowerCase();
        
        apellido2 = partes[2];
        apellido2 = apellido2.substring(0,1).toUpperCase() + apellido2.substring(1).toLowerCase();

        System.out.println(apellido + " " + apellido2 + ", "+ nombre);

        entrada.close();
    }
}
