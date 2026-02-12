package tiendaComidaRapida;

public class Kebab {
	static final int INI_INT = 0;
	
	static final int PRECIO_MIN = 6;
	static final int TIEMPO_MIN = 15;
	static int numeroPedidos = INI_INT;
	private  int numero_adicionales = INI_INT;
	
	//CONSTRUCTORES
		Kebab(int adicionales){
			setNumero_adicionales(adicionales);
			Kebab.numeroPedidos++;
		}
	
	
	//GETTERS Y SETTERS
		public  int getNumero_adicionales() {
			return this.numero_adicionales;
		}
		
		public void setNumero_adicionales(int numero_adicionales) {
			if(numero_adicionales <=5) {
				this.numero_adicionales = numero_adicionales;
			}else {
				this.numero_adicionales = 5;
			}
		}
		
	//METODOS
		public int precioComida() {
			int precio = PRECIO_MIN;
			precio = precio + getNumero_adicionales();
			return precio;
		}
		public int tiempoEntrega() {
			int tiempo = TIEMPO_MIN;
			tiempo = tiempo + (10*getNumero_adicionales());
			return tiempo;
		}


}

