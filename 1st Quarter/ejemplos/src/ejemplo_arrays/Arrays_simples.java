package ejemplo_arrays;

public class Arrays_simples {
	final static int INI_INT = 0;
	public static void main(String[] args) {
		int inicial = INI_INT;
		int[] lista = new int [10];
		
		for (int i = INI_INT; i < lista.length; i++) {
			inicial = inicial + 100;
			lista[i] = inicial;
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	
	}

}
