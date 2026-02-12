package ejercicio5;

public class Arrays_alternos {
	static final int INI_INT = 0;
	
	public static void mostrarArray(int[] array) {
		for (int i = INI_INT; i < array.length; i++) {
			System.out.print("[" + i + "]=" + array[i]);
		}
	}
	
	public static void rellenarAlterno(int[] array1,int []array2) {
		for (int i = INI_INT; i < array2.length; i++) {
			array2[i]= array1[array1.length-i-1];
		}
	}

	
		public static void main(String[] args) {
			int[] array1 = {1,2,3,4,5};
			int[] array2 = new int[array1.length];
			rellenarAlterno(array1,array2);
			System.out.println("Array 1");
			mostrarArray(array1);
			System.out.println("\n-----------");
			System.out.println("Array 2");
			mostrarArray(array2);
		}
}
