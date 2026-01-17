package ejercicio1;
public class Circulo {
	final static int INI_INT = 0;
	final static float INI_FLOAT = 0F;
	public static int contador = INI_INT;
	private float radio = INI_FLOAT;
	
	Circulo (float radio){
		setRadio(radio);
		Circulo.contador++;
	}
	
	public float perimetro() {
		double perimetro = (2*this.radio)*Math.PI;
		return (float)perimetro;
	}
	
	public float area() {
		double area = Math.PI * Math.pow(this.radio, 2);
		return (float) area;
	}

	public float getRadio() {
		return radio;
	}


	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public static int getContador(){
		return Circulo.contador;
	}
	public String getInfo() {
		return "El radio del círculo es " + radio;
	}
}
