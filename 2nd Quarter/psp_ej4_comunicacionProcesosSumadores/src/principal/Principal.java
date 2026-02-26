package principal;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    static int salto = 0;
    
    public static void lanzarSumador(String num1, String num2, String fichero){
        String ruta = "paqueteSumador.Sumador";
        File dir = new File("./bin");
        ProcessBuilder pb = new ProcessBuilder("java", ruta, num1, num2);
        try{
            pb.directory(dir);
            pb.redirectOutput(new File(fichero));
            Process proceso = pb.start();
            Thread.sleep(1000);
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public static File generarFile(int proceso){
        Date fecha = new Date();
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
        File fichero =  new File("resultado_proceso" + (proceso+1)+"_Fecha"+dtf.format(fecha) + ".txt");
        return fichero;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 2 números para sumar");
        System.out.print("Número 1: ");
        int numero1 = entrada.nextInt();
        System.out.print("Número 2: ");
        int numero2 = entrada.nextInt();
        
        salto = ((numero2 - numero1) / 4) - 1;  
        
        int inferior = numero1;
        int superior = numero2;
        for(int i = 0; i < 4; i++){
            File fichero = generarFile(i);
            lanzarSumador(Integer.toString(inferior), Integer.toString(superior), fichero.getPath());
            inferior = inferior + salto + 1 ;
        }
        entrada.close();
        System.out.println("4 procesos lanzados con salto = " + salto);
    }
}
