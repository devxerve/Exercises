package figurasGeometricas;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
	//METODOS
	
	public static int leerInt(Scanner entrada) {
		int output;
		boolean salir;
		output = INI_INT;
		salir = true;
		do {
			try {
				output = entrada.nextInt();
				salir = true;
			} catch (InputMismatchException ex) {
				System.out.println("Entrada invalida, se esperaba un número entero");
				entrada.next();
			}
		} while (!salir);
		return output;
	}
	
	public static float leerFloat(Scanner entrada) {
		float output;
		boolean salir;
		output = INI_FLOAT;
		salir = true;
		do {
			try {
				output = entrada.nextFloat();
				salir = true;
			} catch (InputMismatchException ex) {
				System.out.println("Entrada invalida, se esperaba un número decimal");
				entrada.next();
			}
		} while (!salir);
		return output;
	}

	//CONSTANTES
		
	final static int  INI_INT = 0;
	final static float INI_FLOAT = 0F;
	final static String SEPARADOR = "----------------";

	//MAIN
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int opcion,base,altura,lado;
		float radio = INI_FLOAT;
		opcion = base = altura = lado = INI_INT;
		do {
			//Entrada opción
			System.out.println("¿Con que objeto quieres trabajar? \n 1)Círculo \n 2)Triángulo Equilátero \n 3)Rectángulo \n 4)Salir");
			opcion = leerInt(entrada);
			switch (opcion) {

			case 1:

				//CIRCULO
				
				do {	
					System.out.println("Introduce los datos (radio) del círculo  " + (Circulo.getContador() + 1));
					radio = leerFloat(entrada);
					if(radio<=INI_INT) {
						System.out.println("El radio no puede ser menor o igual a 0, introducelo de nuevo");
					}
				} while (radio<=INI_INT);
				
				Circulo circ = new Circulo(radio);
				System.out.println(circ.getInfo() + " Su  área es: " + circ.area() + " Su perímetro es: " + circ.perimetro());
				System.out.println(SEPARADOR);
				
				break;
				
			case 2:
				
				// TRIANGULO EQUILATERO

				System.out.println("Introduce los datos (Lado y altura) del Triángulo Equilátero "+ (TrianguloEquilatero.getContador() + 1));
				lado = altura = INI_INT;
				do {
					System.out.println("Altura");
					altura = leerInt(entrada);
					if (altura <= INI_INT) {
						System.out.println("La altura no puede ser menor o igual a 0, vuelve a introducirla");
					}
				} while (altura<=INI_INT);
				do {
					System.out.println("Lado");
					lado = leerInt(entrada);
					if (lado <= INI_INT) {
						System.out.println("El lado no puede ser menor o igual a 0, vuelve a introducirlo");
					}
				} while (lado<=INI_INT);
				
				TrianguloEquilatero trian = new TrianguloEquilatero(lado, altura);
				System.out.println(trian.getInfo() + " Su  área es: " + trian.area() + " Su perimetro es: " + trian.perimetro());
				System.out.println(SEPARADOR);
				
				break;

			case 3:

				// RECTANGULO

				System.out.println("Introduce los datos (Base y altura) del Rectángulo  " + (Rectangulo.getContador() + 1));
				base = altura = INI_INT;
				
				do {
					System.out.println("Base");
					base = leerInt(entrada);
					if (base<= INI_INT) {
						System.out.println("La base no puede ser menor o igual a 0, vuelve a introducirla");
					}
				}while (base<=INI_INT);
				
				do {
					System.out.println("Altura");
					altura = leerInt(entrada);
					if (altura <= INI_INT) {
						System.out.println("La altura no puede ser menor o igual a 0, vuelve a introducirla");	
					}
				} while (altura<=INI_INT);
				
				Rectangulo rect = new Rectangulo(base, altura);
				System.out.println(rect.getInfo() + " Su  área es: " + rect.area() + " Su perimetro es: " + rect.perimetro());
				System.out.println(SEPARADOR);
				
				break;

			case 4:
				
				//Salir
				
				System.out.println("El número de Circulos es " + Circulo.getContador());
				System.out.println(SEPARADOR);
				System.out.println("El número de Triangulos es " + TrianguloEquilatero.getContador());
				System.out.println(SEPARADOR);
				System.out.println("El número de Rectángulos es " + Rectangulo.getContador());
				System.out.println(SEPARADOR);
				System.out.println("¡BYEEEEE!");
				
				break;
				
			default:

				//Invalidez

				System.out.println("Opción inválida, vuelve a intentarlo");
				System.out.println(SEPARADOR);
				
				break;
			}
		} while (opcion !=4);
		entrada.close();
	}		
}

