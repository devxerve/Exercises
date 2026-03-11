package ejemplo;

public class Tarea extends Thread{
    private int entero = 0;

    Tarea (int entero){
        this.entero = entero;
    }
    @Override
    public void run(){
        for(int i = this.entero * 10; i < this.entero * 10 + 10; i++) {
            System.out.println("[Tarea " + entero + "] Línea -> " + i);
        }
    }
}
