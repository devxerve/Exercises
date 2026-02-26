package ejercicio1;
import java.util.Scanner;

public class Contador_incremental {
    /**
     * Realizar un programa en Java que solicite la carga de un valor positivo 
     * y nos muestre desde 1 hasta el valor ingresado de uno en uno.
     * Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.
     */
    final static int Ini_int = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = Ini_int;

        do {
            System.out.println("Introduce un valor positivo ");
            valor =  entrada.nextInt();

            if (valor < 0) {
                System.out.println("Valor erróneo, usa otro número");
            }
        } while (valor < 0);

        for (int contador = 1; contador <= valor; contador++) {
            System.out.println(contador);
        }

        entrada.close();
    }
}
