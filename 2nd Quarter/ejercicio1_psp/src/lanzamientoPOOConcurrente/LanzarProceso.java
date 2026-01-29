package lanzamientoPOOConcurrente;

import java.io.IOException;

public class LanzarProceso {
    public static int contador_proceso = 0;
    ProcessBuilder process;
    public String ruta;
    public int numero;

    LanzarProceso(String ruta, int numero) {
        this.ruta = ruta;
        this.numero = numero;
        contador_proceso++;
    }

    public void ejecutar(int numero) {
        System.out.println("Ejecutando el proceso numero " + numero);
        process = new ProcessBuilder(this.ruta);
        try {
            process.start();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error con el proceso " + numero);
        }
    }
}
