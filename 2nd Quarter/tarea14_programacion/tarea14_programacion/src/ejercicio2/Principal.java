package ejercicio2;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        String frase = null;
        String frase_invertida = "";
        System.out.println("Introduce una frase por pantalla");
        frase = entrada.nextLine();
        for(int i = frase.length()-1; i>=0 ;i--){
            frase_invertida = frase_invertida + frase.charAt((i)); // Añade a 'frase_invertida' el carácter de 'frase' empezando desde el final hacia el inicio
        }
        System.out.println(frase_invertida);
    entrada.close();
}
}
