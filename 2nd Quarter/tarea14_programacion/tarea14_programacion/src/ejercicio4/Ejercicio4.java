/**
 * Hacer un programa que pida un texto por pantalla, pida una letra por pantalla (que exista dentro del texto anterior), y pida otra letra por pantalla. 
 * Con todos esos datos, el programa debe sustituir todas las veces donde aparezca la primera letra, por la segunda. Mostrar el texto modificado por pantalla. 
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String texto = "null";
        char buscar = 0;
        char remplazar = 0;
        
        System.out.println("Introduce un texto por pantalla");
        texto = entrada.nextLine();
        System.out.println(texto);
        System.out.println("\n Introduce una letra a buscar en el texto");
        buscar = entrada.nextLine().charAt(0);
        System.out.println("\n Introduce una letra para remplazar en el texto");
        remplazar = entrada.nextLine().charAt(0);

        texto = texto.replace(buscar, remplazar);
        System.out.println(texto);
        entrada.close();
    }
}

