package figurasGeometricas;
public class Circulo implements Cloneable {
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

	@Override
	public String toString() {
		String info =  "El radio del círculo" + super.toString()+ " es " + this.radio;
        return info;
	}
	@Override
	public Circulo clone(){
		Circulo copia = null;
		try {
			copia = (Circulo) super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	return copia;
	}
}
