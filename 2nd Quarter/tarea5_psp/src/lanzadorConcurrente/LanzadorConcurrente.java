package lanzadorConcurrente;
import java.io.*;
import java.util.*;

public class LanzadorConcurrente {

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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número de procesos");
        int numero = leerInt(entrada);
        entrada.nextLine();

        try{
            String[] textos = new String[numero];
            for (int i = 0; i < numero; i++) {
                System.out.println("Introduce un texto para pasar a mayusculas [" + i + "]");
                textos[i] = entrada.nextLine();
            }

            Process[] procesos = new Process[numero];
            for (int i = 0; i < numero; i++) {
                ProcessBuilder pb = new ProcessBuilder("java", "pasamayusculas.PasaMayusculas", String.valueOf(i));
                pb.directory(new File("./bin"));
                procesos[i] = pb.start();

                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(procesos[i].getOutputStream()));
                bw.write(textos[i]);
                bw.close();
            }

            for (int i = 0; i < numero; i++) {
                BufferedReader br = new BufferedReader(new InputStreamReader(procesos[i].getInputStream()));
                String linea;
                StringBuilder salida = new StringBuilder();
                while ((linea = br.readLine()) != null) {
                    salida.append(linea).append("\n");
                }
                br.close();
                
                System.out.print("Proceso " + i + ": " + salida);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        entrada.close();
    }
}