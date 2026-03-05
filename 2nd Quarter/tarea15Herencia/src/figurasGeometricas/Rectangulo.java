package figurasGeometricas;

public class Rectangulo extends FiguraGeometrica implements Cloneable{	
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
			perimetro = (2*this.base)+(2*this.altura);
			return (float) perimetro;
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
		@Override
		public String toString() {
			return "La base del rectángulo" + super.toString()+ "es " + this.base + " y su altura es " + this.altura;
		}

		@Override
		public Rectangulo clone(){
			Rectangulo copia = null;
			try{
				copia = (Rectangulo) super.clone();
			}catch(CloneNotSupportedException e){
				e.printStackTrace();
			}
			return copia;
		}
		@Override 
		public boolean equals(Object obj){
			boolean resultado = false;
			Rectangulo rectangulo = (Rectangulo) obj;

			if((this.altura == rectangulo.altura) && (this.base == rectangulo.base)){
				resultado = true;
				return resultado;
			}else{
				return resultado;
			}
		}
	}


