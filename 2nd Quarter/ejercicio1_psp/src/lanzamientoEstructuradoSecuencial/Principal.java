package lanzamientoEstructuradoSecuencial;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	final static int INI_INT = 0;
	
	public static int lanzarProceso(int num, String ruta){
		int retorno = 0;
		ProcessBuilder lanzador = new ProcessBuilder(ruta);
		
			try {
				Process proceso = lanzador.start();
				retorno = proceso.waitFor();
				System.out.println("Output del proceso " + (num+1) +  " = [Correcto] ");
			} catch (IOException e) {
				System.out.println("[Principal - LanzarProceso]"+ (num+1) + " tiene un error IO");
			}catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("[Principal - LanzarProceso]" + (num+1) + " El proceso fue interrumpido abruptamente");
			} catch(Exception e){
				System.out.println("[Principal - LanzarProceso]"+ (num+1) + "tiene un error desconocido");
			}	
			return retorno;
		
	}

	public static int leerInt(Scanner entrada) {
		int resultado = 0;
		try {
				resultado = entrada.nextInt();
			} catch (InputMismatchException ex) {
				ex.printStackTrace();
				System.out.println("Se esperaba un número entero");
				entrada.next();
			}
			return resultado;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inicio");
		Scanner entrada = new Scanner (System.in);
		int numero_ejecuciones = INI_INT;
		String ruta = "C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe";
		// String ruta = "C:\\Program Files\\WindowsApps\\Microsoft.WindowsNotepad_11.2401.26.0_x64__8wekyb3d8bbwe\\Notepad\\Notepad.exe";
		System.out.println("Introduce el número de veces que quieres lanzar el proceso");
		
		do {
			numero_ejecuciones = leerInt(entrada);
		} while (numero_ejecuciones < 1);
	
		for(int i = 0; i < numero_ejecuciones; i++){
			int resultado = lanzarProceso(i, ruta);
			System.out.println("Resultado del proceso " + (i+1) +" = " + resultado);
			if(resultado == 0){
				System.out.println("Se termino el proceso correctamente");
			}
		}
		System.out.println("[Principal - Main] Bye");
		entrada.close();
	}

	
	
}
