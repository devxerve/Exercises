package lanzadorProyecto;

import java.io.File;
import java.io.IOException;


public class Principal {
public static void main(String[] args) {

	System.out.println("[Lanzador] Inicio del lanzador");
	File dir = new File("C:\\Users\\LABORATORIOS\\OneDrive - UFV\\Documentos\\javi\\Exercises\\1st Quarter\\tarea_12_Tienda_online\\bin\\");
	ProcessBuilder pb = new ProcessBuilder("java", "tiendaComidaRapida.Tienda");
	
	try {
		pb.directory(dir);
		pb.inheritIO();
		Process process = pb.start();
		int retorno = 0;
		try {
			retorno = process.waitFor();
			if(retorno != 0) {
				System.out.println("[Proceso] Error en el proceso");
			}else {
				System.out.println("[Proceso] Todo ha ido bien");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("[Lanzador] Bye");
	System.exit(0);
}
}
