package l6babstrata;

public class Quadrado extends CalculoAreaGeo {
    public Quadrado() {
        super();
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoQuadrado(20 * 20);
        System.out.println("A area do quadrado é: " + quadrado.getLadoQuadrado());
    }

}
