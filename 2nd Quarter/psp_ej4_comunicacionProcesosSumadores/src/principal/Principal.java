package principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void lanzarSumador(String num1, String num2, String fichero){
        String ruta = "paqueteSumador.Sumador";
        File dir = new File("./bin");
        ProcessBuilder pb = new ProcessBuilder("java",ruta,num1,num2);
        try{
            pb.directory(dir);
            pb.redirectOutput(new File(fichero));
            Process proceso = pb.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static String generarRuta(){
        
    }
    public static void main(String[] args) {
        String num1 = null;
        String num2 = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 2 números para sumar");
        System.out.println("Número 1");
        num1 = Integer.toString(entrada.nextInt());
        System.out.println("Número 2");
        num2 = Integer.toString(entrada.nextInt());
        lanzarSumador(num1, num2, );
        
        

    }
}
