package ejercicio2_metodos;
public class Temperatura {
	static final int INI_INT = 0;
	static final float INI_FLOAT = 0F;
	static String SEPARADOR = "-------------------------------------------------------";
public static float conv_a_farenheit(float celsius){
	float conversion = INI_FLOAT;
	conversion = ((celsius * 1.8F)+ 32);
	return conversion;
}
public static float conv_a_celsius(float farenheit){
	float conversion = INI_FLOAT;
	conversion = (farenheit - 32) / 1.8F;
	return conversion;
}
	public static void main(String[] args) {
		float grados = INI_FLOAT;
		System.out.println(SEPARADOR);
		for(grados = 10F; grados <=100F; grados= grados + 10F) {
			float farenheit = conv_a_farenheit(grados);
			System.out.print("|\t" + grados + "\t| \t");
			System.out.printf("%.2f", farenheit);System.out.print("Fº");
			System.out.printf("|\t %.2f", conv_a_celsius(farenheit));System.out.print("Cº\n");		
			}
		System.out.println(SEPARADOR);
		
	}
}
