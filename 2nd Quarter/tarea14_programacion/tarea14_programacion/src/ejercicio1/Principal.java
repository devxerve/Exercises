package ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String frase = "-";
        int longitud = 0;
        
        System.out.println("Introduce una frase por pantalla");
        frase = entrada.nextLine();
        longitud = frase.length();
        System.out.println("La frase tiene " + longitud + " caracteres");
        frase = frase.replaceAll("\\s+", "");
        longitud = frase.length();
        System.out.println("La frase tiene " + longitud + " caracteres (sin espacios)");
        entrada.close();
    }
}

