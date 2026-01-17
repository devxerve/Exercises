package ejemplos;
public class Perro {
	//Caracteristicas
	private String raza;
	private String tamanio;
	private int edad;
	private String color;
	
	Perro (String r, String t, int e, String c){
		raza = r;
		tamanio = t;
		setEdad(e);
		color= c;
		
		}
	
	//EDAD
	public void setEdad(int e) {
			if(e <0) {
				System.out.println("Edad no puede ser negativa, vuelve a intentarlo");
			}else {
				edad = e;
			} 
	}
	
	public int getEdad(){
		return edad;
	}
	
	//RAZA
	public void setRaza(String r) {
		raza = r;
	}
	
	public String getRaza(){
		return raza;
	}
	
	//TAMAÑO
	public void setTamanio(String t) {
		tamanio = t;
	}
	
	public String getTamanio(){
		return tamanio;
	}
	
	//COLOR
	public void setColor(String c) {
		color = c;
	}
	
	public String getColor() {
		return color;
	}
	
	//ACCIONES
	public void dormir() {
		System.out.println("ZZZZzzz");
	}
	
	public void ladrar() {
		System.out.println("GUAAAU");
	}
	
	public String getInfo() {
		return "Raza: " + raza + " Tamaño: " + tamanio + " Edad: " + edad + " Color: " + color;
	}
}
