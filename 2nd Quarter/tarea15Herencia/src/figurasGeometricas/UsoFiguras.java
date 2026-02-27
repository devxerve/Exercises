package figurasGeometricas;
public class UsoFiguras {
    public static void main(String[] args) {
        Circulo cir1 = new Circulo(3);
        System.out.println(cir1.toString());
        TrianguloEquilatero tr1 = new TrianguloEquilatero(4, 7);
        System.out.println(tr1.toString());
        Rectangulo re1 = new Rectangulo(5, 15);
        System.out.println(re1.toString());
        Circulo cir2 = cir1.clone();
        System.out.println(cir2.toString());
    }
    
}
