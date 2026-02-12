package tiendaComidaRapida;

public class Pizza {
	static final int INI_INT = 0;
	
	static final int PRECIO_MIN = 8;
	static final int TIEMPO_MIN = 30;
	static int numeroPedidos = INI_INT;
	private  int numero_adicionales = INI_INT;
	
	//CONSTRUCTORES
		Pizza(int adicionales){
			setNumero_adicionales(adicionales);
			Pizza.numeroPedidos++;
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

