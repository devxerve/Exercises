package principal;

import java.io.File;

public class LanzadorProcesoJavaArgs {
	
	public static void lanzarProceso(String par1, String par2) {
		String clase = "sumador.Sumador";
		File dir = new File("/bin");
		
		// par1 y par2 son los argumentos del proceso Sumador
		ProcessBuilder pb = new ProcessBuilder ("java", clase, par1, par2);
		try {
			pb.directory(dir);
			//pb.inheritIO();
			
			Process process = pb.start();
			
			//Para lanzar los procesos de manera concurrente
			//int retorno = process.waitFor();
			//System.out.println("[main] Retorno del proceso: " + retorno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("[Principal] Iniciando");
		// Llamar a lanzarProceso, para que ejecute Sumador 2 veces
		// Una vez con argumentos 1, 51
		// Otra vez con argumentos 51, 100
		
		lanzarProceso(String.valueOf(1), String.valueOf(51));
		System.out.println("[Principal] Lanzado proceso java sumador.Sumador 1 51");		
		lanzarProceso("51", "100");
		System.out.println("[Principal] Lanzado proceso java sumador.Sumador 51 100");
		
		System.out.println("[Principal] Bye");
	}
	
}
