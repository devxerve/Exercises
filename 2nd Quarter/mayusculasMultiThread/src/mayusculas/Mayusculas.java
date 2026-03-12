package mayusculas;

public class Mayusculas extends Thread {
    String texto = null;
    private int numero = 0;
    public Mayusculas(String texto, int numero){
        this.texto = texto;
        this.numero = numero+1;
    }
    public String getTexto(){
        return this.texto;
    }
    public int getNumero(){
        return this.numero;
    }

    @Override
    public void run(){
        String convertido =  this.texto.toUpperCase();
        System.out.println("[THREAD MAYUSCULAS " + numero + "] - texto convertido " + numero+ ": " + convertido);
    }
    
}
