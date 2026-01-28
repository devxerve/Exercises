package lanzamientoPOOConcurrente;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
final static String ruta = "\"C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe\"";   
final static int INI_INT = 0;
public static void main(String[] args) {
    System.out.println("Inicio");
		Scanner entrada = new Scanner (System.in);
        int numero = INI_INT;
        ArrayList<LanzarProceso> lista_procesos = new ArrayList<LanzarProceso>();
		System.out.println("Introduce el número de veces que quieres lanzar el proceso");
        numero = entrada.nextInt();
        for(int i = INI_INT; i<numero; i++){
            LanzarProceso proceso = new LanzarProceso(ruta);
            lista_procesos.add(proceso);  
        }
        int contador = INI_INT;

        for (LanzarProceso proceso : lista_procesos) {
            
            contador++;
            proceso.ejecutar(contador);
        }
        entrada.close();
}
}
