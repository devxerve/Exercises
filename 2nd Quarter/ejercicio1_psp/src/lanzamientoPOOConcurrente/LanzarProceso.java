package lanzamientoPOOConcurrente;

import java.io.IOException;

public class LanzarProceso {
    public static int contador_proceso = 0;
    ProcessBuilder process;
    LanzarProceso(String ruta){
        process = new ProcessBuilder(ruta);
        contador_proceso++;
    }
    
    public void ejecutar(int numero){
        System.out.println("Ejecutando el proceso numero " + numero);
        try {
            process.start();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error con el proceso " + numero);
        }
    }
}
