package ejercicio1_metodos;
import java.util.Scanner;
public class Mayor_menor {
	static final int INI_INT =0;
	static final String  SEPARADOR = "--------";
	public static int calc_menor(int numero_1, int numero_2, int numero_3) {
		int menor =INI_INT;
		if(numero_1 > numero_2) {
			menor = numero_2;
			}else if(numero_2 > numero_3) {
				menor = numero_3;
			}else menor = numero_1;
		return menor;
		}
	public static int calc_mayor(int numero_1, int numero_2, int numero_3) {
		int mayor =INI_INT;
		if(numero_1 < numero_2) {
			mayor = numero_2;
			}else if(numero_2 < numero_3) {
				mayor = numero_3;
			}else mayor = numero_1;
		return mayor;
		}

	public static void main(String[] args) {
		 int n1, n2, n3, menor_output, mayor_output;
		 n1 = n2 = n3 = menor_output = INI_INT;
		 Scanner entrada = new Scanner (System.in);
		 
		 System.out.println("Introduce el primer numero");
		 n1 =entrada.nextInt();
		 System.out.println(SEPARADOR);
		 System.out.println("Introduce el segundo numero");
		 n2 =entrada.nextInt();
		 System.out.println(SEPARADOR);
		 System.out.println("Introduce el tercer numero");
		 n3 =entrada.nextInt();
		 
		 menor_output=calc_menor(n1,n2,n3);
		 mayor_output=calc_mayor(n1,n2,n3);
		 
		 System.out.println(menor_output + " Es el número menor de entre \t" +  + n1  + "\t" + n2 + "\t" + n3);
		 System.out.println(SEPARADOR);
		 System.out.println(mayor_output + " Es el número mayor de entre \t" + n1 + "\t" + n2 + "\t" + n3);
		 
		 entrada.close();
	}

}
