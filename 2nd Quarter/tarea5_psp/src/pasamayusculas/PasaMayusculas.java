package pasamayusculas;

import java.util.Scanner;

public class PasaMayusculas {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Argumentos incorrectos");
            System.exit(10);
        }
        try {
            int numero = Integer.parseInt(args[0]);
            
            
            Scanner sc = new Scanner(System.in);
            String texto = sc.nextLine().trim();
            sc.close();
            
            if (texto.isEmpty()) {
                System.err.println("Error entrada vacia");
                System.exit(30);
            }
            
            System.out.println("[" + numero + "] " + texto.toUpperCase());
            
        } catch (NumberFormatException e) {
            System.err.println("Número inválido: " + e.getMessage());
            System.exit(20);
        }
    }
}
