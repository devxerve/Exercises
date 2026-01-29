package ejercicio3;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        String pswd = "java_ejercicio3";
        String input_pswd = null;
        int contador = 0;
        do {
            System.out.println("Introduce la contraseña");
            input_pswd = entrada.nextLine();
            contador++;
            if(pswd.compareTo(input_pswd) == 0){
                contador = 4;
            }else{
                if(contador !=3){
                    System.out.println("Contraseña incorrecta quedan " + (3-contador) + " intentos");
                }
            };
        } while (contador < 3);
        if(contador == 4){
            System.out.println("Enhorabuena");
        }else{
            System.out.println("Contraseña incorrecta");
        }
        
    entrada.close();
}
}
