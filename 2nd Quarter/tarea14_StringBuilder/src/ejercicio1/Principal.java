package ejercicio1;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int vocales = 0;
        
        System.out.println("Introduce una frase por pantalla");
        sb.append(entrada.nextLine());
        char[] deletreada = new char[sb.length()];
        deletreada = sb.toString().toLowerCase().toCharArray();

        for(int i = 0; i<deletreada.length; i++){
            if((deletreada[i]=='a')|| (deletreada[i] == 'e')|| (deletreada[i]== 'i') || (deletreada[i]== 'o')||(deletreada[i] == 'u')){
                vocales++;
            }
            
        }
        System.out.println("El numero de vocales es "+ vocales);
        entrada.close();
    }

}


