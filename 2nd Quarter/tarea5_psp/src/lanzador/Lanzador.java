package lanzador;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanzador {
    public static int leerInt(Scanner entrada) {
        int output = 0;
        boolean salir = false;
        do {
            try {
                output = entrada.nextInt();
                salir = true;
            } catch (InputMismatchException ex) {
                System.out.println("Entrada invalida, se esperaba un número entero");
                entrada.next();
            }
        } while (!salir);
        return output;
    }

    static String lanzarProceso(int numero, String texto) {
        StringBuilder salida = new StringBuilder();
        String clase = "pasamayusculas.PasaMayusculas";
        ProcessBuilder pb = new ProcessBuilder("java", clase, String.valueOf(numero));
        File dir = new File("./bin");
        pb.directory(dir);
        try {
            Process proceso = pb.start();
            
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            bw.write(texto);  
            bw.flush();
            bw.close();    
            
            
            BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            linea = br.readLine();
            while ( linea!= null) {
                salida.append(linea).append("\n");
            }
            br.close();
            
            
            proceso.waitFor();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return salida.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número de procesos");
        int numero = leerInt(entrada);
        entrada.nextLine();
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce un texto para pasar a mayusculas");
            String texto = entrada.nextLine();
            String resultado = lanzarProceso(i, texto);
            System.out.print(resultado);
        }
        entrada.close();
    }
}
