package ejercicio7;

import java.util.Scanner;

public class Principal {
    final static int MINUTOS = 1440; // 24*60
    public static void main(String[] args) {
        String tiempo = null;
        Scanner entrada = new Scanner (System.in);
        int horas = 0;
        int minutos = 0;
        int restante = 0;
       

        System.out.println("Introduce una hora en formato HH:MM (24 horas)");

        tiempo = entrada.nextLine();

        String[] tiempo_separado = tiempo.split(":");
        if(tiempo_separado.length != 2){
            tiempo_separado = tiempo.split("\\s+");
        }

        horas = Integer.parseInt(tiempo_separado[0]);
        minutos = Integer.parseInt(tiempo_separado[1]);
        
        System.out.println(horas + ":" + minutos);

        restante = MINUTOS - ((horas*60) + minutos);
        System.out.println(restante + " minutos para la medianoche");


        entrada.close();
    }
    
    
}
