package lanzamientoPOOConcurrente;

import java.io.IOException;

public class LanzarProceso {
    ProcessBuilder lanzador = null;
    public String ruta = null;
    

    LanzarProceso(String ruta) {
        this.ruta = ruta;
    }

    public void ejecutar(int numero) {
        System.out.println("[LanzarProceso - ejecutar] Ejecutando el proceso " + numero);
        lanzador = new ProcessBuilder(this.ruta);
        try {
            lanzador.start();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[LanzarProceso - ejecutar] Error con el proceso " + numero);
        }
    }
}
