package paqueteSumador;

public class Sumador {
    public static void main(String[] args) {
       
        if(args.length == 0){
            System.out.println("Se esperaban 2 argumentos de entrada");
            System.exit(0);
        }
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int suma = num1 + num2;
        System.out.println(suma);  
    }
}
