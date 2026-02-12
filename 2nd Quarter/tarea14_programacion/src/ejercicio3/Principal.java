package ejercicio3;

import java.util.Scanner;

public class Principal {
final static String pswd = "java_ejercicio3";
final static int MAX_INTENTOS = 3;
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        String input_pswd = null;
        int intentos = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce la contraseña");
            input_pswd = entrada.nextLine();
            intentos++;
            if(pswd.compareTo(input_pswd) == 0){
                valido = true;
                intentos = 4;
            }else{
                if(intentos !=3){
                    System.out.println("Contraseña incorrecta quedan " + (3-intentos) + " intentos");
                }
            };
        } while (intentos < MAX_INTENTOS);
        if(valido){
            System.out.println("Enhorabuena");
        }else{
            System.out.println("Contraseña incorrecta");
        }
        
    entrada.close();
}
}

