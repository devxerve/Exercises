package ejercicio5;

import java.util.Scanner;

/*
 * Hacer un programa que pida un nombre completo por pantalla (Nombre Apellido Apellido) y lo guarde en una sola variable String. Después habrá que trocear el dato, separándolo en Nombre,
 * Apellido1, y Apellido2. Por último, mostrar por pantalla el nombre ordenado de la siguiente manera: Apellido1 Apellido2, Nombre
 */
public class Principal {
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
        apellido = partes[1];
        apellido2 = partes[2];

        System.out.println(apellido + " " + apellido2 + ", "+ nombre);

        entrada.close();
    }
   
    
}
