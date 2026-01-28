package lanzamientoEstructuradoSecuencial;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	final static int INI_INT = 0;
	
	public static void lanzarProceso(int num, String ruta){
		ProcessBuilder lanzador = new ProcessBuilder(ruta);
		
		for (int i = INI_INT; i < num; i++) {
			try {
				Process proceso = lanzador.start();
				try {
					proceso.waitFor();
				} catch (InterruptedException e) {
					System.out.println("El proceso fue interrumpido abruptamente");
					e.printStackTrace();
				}
				System.out.println("Output del proceso " + (i+1) +  " = [Correcto] ");
			} catch (IOException e) {
				System.out.println("Error al lanzar el proceso");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inicio");
		Scanner entrada = new Scanner (System.in);
		int numero_ejecucion = INI_INT;
		String ruta = "C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe";
		System.out.println("Introduce el número de veces que quieres lanzar el proceso");
		
		do {
			try {
				numero_ejecucion = entrada.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Se esperaba un número entero");
				entrada.next();
			} 
		} while (numero_ejecucion < 1);
	
		lanzarProceso(numero_ejecucion, ruta);
		System.out.println("Bye");
		entrada.close();
	}
}
