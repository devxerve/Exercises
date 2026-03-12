package principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import mayusculas.Mayusculas;

public class Principal {
   
    public static int leerInt(Scanner entrada){
        
        try{
            return entrada.nextInt();
        }catch(InputMismatchException e){
            
            e.printStackTrace();
            return -1;
        }
         
    }
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("[MAIN THREAD] - Introduce el número de textos que quieres formatear");
    int numeroTextos = leerInt(entrada);
    ArrayList<Mayusculas> listaConversores = new ArrayList<Mayusculas>();
    
    if(numeroTextos == -1){
        System.out.println("[MAIN THREAD] - Error al leer el número de textos\n");
    }

    entrada.nextLine();

    ArrayList<String> listaTextos = new ArrayList<String>();
    for (int i = 0; i < numeroTextos; i++) {
        System.out.println("[MAIN THREAD] - Introduce un texto y presiona ENTER para guardarlo");
        listaTextos.add(entrada.nextLine());
    }

    for (String texto : listaTextos) {
        Mayusculas conversor = new Mayusculas(texto,listaTextos.indexOf(texto));
        listaConversores.add(conversor);
        conversor.start();
        
    }
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    for(Mayusculas conversor :listaConversores){
        System.out.println("[MAIN] - el texto "+  conversor.getNumero() +" antes de convertirlo es: " + conversor.getTexto());
    }
    entrada.close();
    System.out.println("BYEE!");
}

    
    
}
