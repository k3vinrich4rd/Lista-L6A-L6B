package l6binterface;

public class Circulo implements FiguraGeometrica{
    @Override
    public void calculoGeometrico() {
        double pi = 3.14;
        double raioCirculo = 4;
        double areaDoCirculo = 2;

        areaDoCirculo = pi * (raioCirculo * raioCirculo);
        System.out.println("O resultado da área do circulo é: " + areaDoCirculo);
    }
}
