package psp_ejemplo1;

public class Ejemplo1 {
public static void main(String[] args) {
	String ruta = "C:\\Users\\LABORATORIOS\\AppData\\Local\\Programs\\Obsidian\\Obsidian.exe";
	Process_launch pl = new Process_launch(ruta);
	pl.ejecutar();
}
}
