package ejercicio5;

public class Conversor_for {
	final static float conversor = 1.8F;
	final static float inicial_float= 0F;
	public static void main(String[] args) {
	
		float farenheit = inicial_float;
		String separador = "----------------";
		String tabla = "|Celsius|Farenheit";
		System.out.println(tabla);
		for(float grados = 10F; grados <=100F ;grados = grados + 10F) {
			farenheit = (grados*conversor)+32;
			System.out.print("|"); System.out.printf("%.2f",grados);System.out.print("\t|"); System.out.printf("%.2f",farenheit);System.out.print("|\n");
			System.out.println(separador);
		}
}
}