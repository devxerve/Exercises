package lanzamientoPOOConcurrente;


import java.util.Scanner;

public class Principal {
final static String RUTA = "\"C:\\Program Files\\Notepad++\\notepad++.exe\"";
// final static String RUTA = "\"C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe\"";
final static int INI_INT = 0;
public static void main(String[] args) {
    System.out.println("Inicio");
		Scanner entrada = new Scanner (System.in);
        int numero = INI_INT;
		System.out.println("Introduce el número de veces que quieres lanzar el proceso");
        numero = entrada.nextInt();

        for(int i = INI_INT; i <numero; i++){
            LanzarProceso proceso = new LanzarProceso(RUTA);
            proceso.ejecutar(i+1); 
        }

        
        System.out.println("[Principal - main] Bye");
        entrada.close();
}
}
