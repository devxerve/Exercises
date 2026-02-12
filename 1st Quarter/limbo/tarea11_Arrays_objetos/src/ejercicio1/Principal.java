package ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;
	public class Principal {
		//CONSTANTES
		
				final static int  INI_INT = 0;
				final static float INI_FLOAT = 0F;
				final static int TAM = 10;
				final static String SEPARADOR = "----------------";
		
		//METODOS
		
			public static int leerInt(Scanner entrada) {
				int output;
				boolean salir = false;
				output = INI_INT;
				
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
				boolean salir = false;
				output = INI_FLOAT;
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
		
			//MOSTRAR CIRCULOS
				public static void recorrerCirculos(Circulo[]circulos) {
					System.out.println("Circulos");
					for (int i = 0; i < Circulo.contador; i++) {
						System.out.println(circulos[i].getInfo()+ "(Circulo " + (i+1) + ")");
					}
				}
				
			//MOSTRAR TRIANGULOS
				public static void recorrerTriangulos(TrianguloEquilatero[] triangulos) {
					System.out.println("Triangulos");
					for (int i = 0; i <TrianguloEquilatero.contador; i++) {
						System.out.println(triangulos[i].getInfo()+ "(Triangulo " + (i+1) + ")");
					}
				}
				
			//MOSTRAR RECTANGULOS
				public static void recorrerRectangulos(Rectangulo[] rectangulos) {
					System.out.println("Rectangulo");
					for (int i = 0; i < Rectangulo.contador; i++) {
						System.out.println(rectangulos[i].getInfo()+ "(Rectangulo " + (i+1) + ")");
					}
				}
	
		//MAIN
		
			public static void main(String[] args) {
				Scanner entrada = new Scanner (System.in);
				int opcion,base,altura,lado;
				opcion = base = altura = lado =INI_INT;
				float radio = INI_FLOAT;
				Circulo[] circulos = new Circulo[TAM];
				TrianguloEquilatero[] triangulos = new TrianguloEquilatero[TAM];
				Rectangulo[] rectangulos = new Rectangulo[TAM];
				
				do {
					//Entrada opción
					System.out.println("¿Con que objeto quieres trabajar? \n 1)Círculo \n 2)Triángulo Equilátero \n 3)Rectángulo \n 4)Salir");
					opcion = leerInt(entrada);
					switch (opcion) {
		
					case 1:
		
						//CIRCULO
						
						do {	
							System.out.println("Introduce los datos (radio) del círculo  " + (Circulo.contador + 1));
							radio = leerFloat(entrada);
							if(radio<=INI_INT) {
								System.out.println("El radio no puede ser menor o igual a 0, introducelo de nuevo");
							}
						} while (radio<=INI_INT);
						
						circulos[Circulo.contador]= new Circulo(radio);
						System.out.println(circulos[Circulo.contador-1].getInfo() + " Su  área es: " + circulos[Circulo.contador-1].area() + " Su perimetro es: " + circulos[Circulo.contador-1].perimetro());
						
						
						break;
						
					case 2:
						
						// TRIANGULO EQUILATERO
		
						System.out.println("Introduce los datos (Lado y altura) del Triángulo Equilátero "+ (TrianguloEquilatero.contador + 1));
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
						
						triangulos[TrianguloEquilatero.contador]= new TrianguloEquilatero(lado,altura);
						System.out.println(triangulos[TrianguloEquilatero.contador-1].getInfo() + " Su  área es: " + triangulos[TrianguloEquilatero.contador-1].area() + " Su perimetro es: " + triangulos[TrianguloEquilatero.contador-1].perimetro());
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
						
						rectangulos[Rectangulo.contador] = new Rectangulo(base,altura);
						System.out.println(rectangulos[Rectangulo.contador-1].getInfo() + " Su  área es: " + rectangulos[Rectangulo.contador-1].area() + " Su perimetro es: " + rectangulos[Rectangulo.contador-1].perimetro());
						System.out.println(SEPARADOR);
						
						break;
		
					case 4:
						
						//Salir
						
						System.out.println("El número de Circulos es " + Circulo.contador);
						System.out.println(SEPARADOR);
						System.out.println("El número de Triangulos es " + TrianguloEquilatero.contador);
						System.out.println(SEPARADOR);
						System.out.println("El número de Rectángulos es " + Rectangulo.contador);
						System.out.println(SEPARADOR);
						
						
						recorrerCirculos(circulos);
						recorrerRectangulos(rectangulos);
						recorrerTriangulos(triangulos);
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

