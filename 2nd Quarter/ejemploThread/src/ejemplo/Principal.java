package ejemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Introduce un número de veces de la ejecucion de la tarea");
        int ejecuciones = leerInt();
        lanzar(ejecuciones);
        System.out.println("[Main Thread] BYEE");
    }


    public static void lanzar(int ejecuciones) {
        for(int i = 0;i<ejecuciones;i++){
            Tarea j = new Tarea(i+1);
            j.run();
            try {
                if(!(i+1==ejecuciones)){
                    System.out.println("============SIGUIENTE THREAD============");
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int leerInt() {
        int output = 0;
       try (Scanner entrada = new Scanner(System.in)) {
             output = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Error, entrada invalida. -> ");
            e.printStackTrace();
        }
        return output;
    }
}
