package l6binterface;

public class Quadrado implements FiguraGeometrica {
    @Override
    public void calculoGeometrico() {
        double ladoQuadrado = 4;
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("O resultado da area do quadrado é: " + areaQuadrado);


    }


}

