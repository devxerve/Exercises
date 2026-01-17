package ejercicio4;

public class ejercicio4 {
	static final int INI_INT = 0;
	static final float INI_FLOAT = 0F;
	static final int POSICIONES = 100;
	public static void rellenarArray(int array[]) {
		int suma = INI_INT;
		float media = INI_FLOAT;
		for (int i = INI_INT; i < array.length; i++) {
			array[i] = i + 1;
			suma+= array[i];
		}
		media = (float)suma / array.length;
		System.out.println("La suma es " + suma + " y la media es " + media);
}

	public static void main(String[] args) {
		int[] numeros = new int[POSICIONES];
		rellenarArray(numeros);
		
		
	}

}
