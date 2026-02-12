package tiendaComidaRapida;


//IMPORTACIONES
	import java.util.ArrayList;
	import java.util.InputMismatchException;
	import java.util.Scanner;
	import java.io.PrintStream;
	import java.io.UnsupportedEncodingException;
	import java.nio.charset.StandardCharsets;
	
public class Tienda {
		
//CONSTANTES
	static final int INI_INT = 0;
			
//METODOS
	public static int leerOpcionValida(Scanner entrada, int min, int max) {
		int output = INI_INT;
		boolean salir = false;
		do {
			try {
				output = entrada.nextInt();
				if((output >min) && (output <=max)) {
					salir = true;
				}else {
					System.out.println("Introduce un número entre 1 y 5");					
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Opción no válida, Introduce un número valido");
				entrada.next();
			} 
		} while (!salir);
		return output;
	}
	/**
	 *  Setea el charset para formatear la salida (UTF-8)
	 */
	private static void setCharset() {
		try {
			System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
			
//MAIN
	public static void main(String[] args) {
		setCharset();
	//DECLARACION E INICIALIZACION DE VARIABLES Y OBJETOS
		int opcion, precio_total_k, precio_total_p, precio_total_h ,precio_total;
		opcion = precio_total_k = precio_total_p = precio_total_h = precio_total = INI_INT;
		Scanner entrada = new Scanner (System.in);	
		int adicionales = INI_INT;
		ArrayList<Hamburguesa> lista_hamburguesa = new ArrayList<Hamburguesa>();
		ArrayList<Pizza> lista_pizza = new ArrayList<Pizza>();
		ArrayList<Kebab> lista_kebab = new ArrayList<Kebab>();
		
		
			
	//INSTRUCCIONES	
		
		do {
			System.out.println("Elige la opción del menú." + "\n1) Encargar Hamburguesa"+ "\n2) Encargar Pizza" + "\n3) Encargar Kebab"
		            + "\n4) Resumen de Pedidos" + "\n5) Finalizar");
			opcion =leerOpcionValida(entrada,0,5);
				switch (opcion) {
				case 1:
					 
					System.out.println("|*** HAS ELEGIDO HAMBURGUESA ***|");
					System.out.println("Introduce un número de ingredientes adicionales para tu hamburguesa (0-5)");
					
					adicionales = leerOpcionValida(entrada,0,5);
					lista_hamburguesa.add(new Hamburguesa(adicionales));
					
					System.out.println("La hamburguesa tardara " + lista_hamburguesa.getLast().tiempoEntrega() + " minutos en hacerse");
					System.out.println("La hamburguesa tiene " + lista_hamburguesa.getLast().getNumero_adicionales()+ " ingrediente(s) adicional(es)");
					System.out.println("La hamburguesa tiene un precio de " + lista_hamburguesa.getLast().precioComida() + " €");
					
					System.out.println("\n|*** Fin del pedido Hamburguesa ***|\n");
					 
					break;
					
				case 2:
					 
					System.out.println("|*** HAS ELEGIDO PIZZA ***|");
					System.out.println("Introduce un número de ingredient(es) adicionales para tu pizza (0-5)");
					adicionales = leerOpcionValida(entrada,0,5);
					lista_pizza.add(new Pizza(adicionales));
					
					System.out.println("La Pizza tardara " + lista_pizza.getLast().tiempoEntrega()+ " minutos en hacerse");
					System.out.println("La Pizza tiene " + lista_pizza.getLast().getNumero_adicionales()+ " ingrediente(s) adicional(es)");
					System.out.println("La Pizza tiene un precio de " + lista_pizza.getLast().precioComida() + " €");
					
					System.out.println("\n|*** Fin del pedido Pizza ***|\n");
					 
					break;
					
				case 3:
					 
					System.out.println("|*** HAS ELEGIDO KEBAB ***|");
					System.out.println("Introduce un número de ingredient(es) adicionales para tu kebab (0-5)");
					adicionales = leerOpcionValida(entrada,0,5);
					lista_kebab.add(new Kebab(adicionales));
					
					System.out.println("La KEBAB tardara " + lista_kebab.getLast().tiempoEntrega()+ " minutos en hacerse");
					System.out.println("La KEBAB tiene " + lista_kebab.getLast().getNumero_adicionales()+ " ingrediente(s) adicional(es)");
					System.out.println("La KEBAB tiene un precio de " + lista_kebab.getLast().precioComida() + " €");
					
					System.out.println("\n|*** Fin del pedido KEBAB ***|\n");
					 
					break;
					
				case 4:
					System.out.println("|**** RESUMEN DE PEDIDOS ****|");
					
					 
					System.out.println("\n|*** HAMBURGUESAS ***|");
					for (int i = INI_INT; i < lista_hamburguesa.size(); i++) {
						System.out.println("La hamburguesa " + (i+1) + " tiene "+ lista_hamburguesa.get(i).getNumero_adicionales() + " ingrediente(s) adicional(es)");	
						System.out.println("La Hamburguesa " + (i+1) + " tardará "+ lista_hamburguesa.get(i).tiempoEntrega() + " minutos en hacerse");
						System.out.println("La Hamburguesa " + (i+1) + " Cuesta "+ lista_hamburguesa.get(i).precioComida() + " €");
						System.out.println("-------------------");
						
					}
					
					
					System.out.println("\n|*** PIZZAS ***|");
					
					for (int i = INI_INT; i < lista_pizza.size(); i++) {
						System.out.println("La Pizza " + (i+1) + " tiene "+ lista_pizza.get(i).getNumero_adicionales() + " ingrediente(s) adicional(es) ");
						System.out.println("La Pizza " + (i+1) + " tardará "+ lista_pizza.get(i).tiempoEntrega() + " minutos en hacerse");
						System.out.println("La Pizza " + (i+1) + " Cuesta "+ lista_pizza.get(i).precioComida() + " €");
						System.out.println("-------------------");
	
						
					}
					
					System.out.println("\n|*** KEBABS ***|");
					
					for (int i = INI_INT; i < lista_kebab.size(); i++) {
						System.out.println("El Kebab " + (i+1) + " tiene "+ lista_kebab.get(i).getNumero_adicionales() + " ingrediente(s) adicional(es) ");
						System.out.println("El Kebab " + (i+1) + " tardará "+ lista_kebab.get(i).tiempoEntrega() + " minutos en hacerse");
						System.out.println("El Kebab " + (i+1) + " tiene "+ lista_kebab.get(i).precioComida() + " € ");
						System.out.println("-------------------");
						
						}
					
					break;
					
					
				case 5:
					for (Hamburguesa ham : lista_hamburguesa) {
						precio_total_h = precio_total_h +  ham.precioComida();
					}
					for (Pizza piz: lista_pizza) {
						precio_total_p = precio_total_p + piz.precioComida();
					}
					for (Kebab keb : lista_kebab) {
						precio_total_k = precio_total_k + keb.precioComida();
						}
					precio_total = (precio_total_h+precio_total_p+precio_total_k);
					
					System.out.println("\n|*** TOTAL A PAGAR ***|");
					System.out.println("*** El precio total es " + precio_total + " € ***");
					System.out.println("Byeeee!!!");
				break;
				
				default:
					System.out.println("Introduce una opción válida");
					break;
				}
					
			
		} while (opcion !=5);
		
		
	}	
}

