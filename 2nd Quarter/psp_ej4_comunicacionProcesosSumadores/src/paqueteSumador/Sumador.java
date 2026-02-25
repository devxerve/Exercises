package paqueteSumador;

public class Sumador {
    static int sumar(int num1,int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Error, se necesitan 2 números");
        }
        sumar(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
}
