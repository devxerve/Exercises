package psp_ejemplo1;


import java.io.IOException;

public class Process_launch {
	String ruta;

public Process_launch(String ruta) {
	this.ruta = ruta;
}


public void ejecutar() {
	ProcessBuilder pb = new ProcessBuilder(this.ruta);
	
	try {
		pb.start();
	} catch (IOException e) {
		
		e.printStackTrace();
	}

}

	
}
