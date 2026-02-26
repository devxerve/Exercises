package ejercicio1;
public class TrianguloEquilatero {
	
		final static int INI_INT = 0;
		public static int contador = INI_INT;
		private int lado = INI_INT;
		private int altura = INI_INT;
		
		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}

		TrianguloEquilatero (int lado, int altura){
			setLado(lado);
			setAltura(altura);
			TrianguloEquilatero.contador++;
		}
		
		public float perimetro() {
			float perimetro = this.lado*3;
			return perimetro;
		}
		
		public int area() {
			int area = (this.lado*2)/this.altura ;
			return area;
		}

		public float getlado() {
			return lado;
		}


		public void setLado(int lado) {
			this.lado = lado;
		}
		
		public static int getContador(){
			return TrianguloEquilatero.contador;
		}
		public String getInfo() {
			return "El lado del triángulo es " + lado + " y su altura es " + altura;
		}
	}
