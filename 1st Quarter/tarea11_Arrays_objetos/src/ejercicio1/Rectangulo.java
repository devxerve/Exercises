package ejercicio1;

public class Rectangulo {	
		final static int INI_INT = 0;
		public static int contador = INI_INT;
		private int altura = INI_INT;
		private int base = INI_INT;
		
		public int getBase() {
			return base;
		}

		public void setBase(int base) {
			this.base = base;
		}

		Rectangulo (int base, int altura){
			setBase(base);
			setAltura(altura);
			Rectangulo.contador++;
		}
		
		public float perimetro() {
			float perimetro = (2*this.base)+(2*this.altura);
			return perimetro;
		}
		
		public int area() {
			int area = this.base*this.altura;
			return area;
		}

		public float getAltura() {
			return altura;
		}


		public void setAltura(int altura) {
			this.altura = altura;
		}
		
		public static int getContador(){
			return Rectangulo.contador;
		}
		public String getInfo() {
			return "La base del rectángulo es " + base + " y su altura es " + altura;

	}
}
