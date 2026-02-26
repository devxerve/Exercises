package a_ejercicio2_control;
import java.util.Scanner;
public class Rectangulo {
	static final int INI_INT = 0;
	public static void main(String[] args) {
	int ancho,alto;
	ancho = alto = INI_INT;
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Introduce el alto del rectangulo que quieres dibujar");
	alto = entrada.nextInt();
	System.out.println("Introduce el ancho del rectangulo que quieres dibujar");
	ancho = entrada.nextInt();
	
	for(int i= INI_INT; i<alto; i++) {
		for(int j = INI_INT; j<ancho; j++) {
		if((i==0)||(i==(alto -1)|| (j==0)|| (j== (ancho-1)))){
			System.out.print("*");
		}else System.out.print("-");
	}
		System.out.println();
	entrada.close();
	}
	}
}

