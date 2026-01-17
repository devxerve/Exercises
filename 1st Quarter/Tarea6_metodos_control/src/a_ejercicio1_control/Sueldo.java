package a_ejercicio1_control;
import java.util.Scanner;
public class Sueldo {
	static final int INI_INT = 0;
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int sueldo, antiguedad;
		sueldo = antiguedad = INI_INT;
		
		System.out.println("Introduce el sueldo actual del empleado");
		sueldo = entrada.nextInt();
		System.out.println("Introduce la antiguedad del empleado");
		antiguedad = entrada.nextInt();
	
		if(antiguedad >=10) {
			sueldo += (sueldo*0.1);
		}else if(antiguedad >5) {
			sueldo += (sueldo*0.07);
		}else if(antiguedad>3) {
			sueldo += (sueldo*0.05);
		}else {
			sueldo += (sueldo*0.03);
		}
		
		System.out.println("El nuevo sueldo del empleado es " + sueldo);
		entrada.close();
	}
	}

