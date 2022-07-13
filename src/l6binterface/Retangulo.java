package l6binterface;

public class Retangulo implements FiguraGeometrica {

    @Override
    public void calculoGeometrico() {
        double areaRetangulo = 5;
        double baseRetangulo = 3;
        double alturaRetangulo = 2;
        System.out.println("O resultado da area do retangulo: " + areaRetangulo);
        areaRetangulo = baseRetangulo * alturaRetangulo;

    }
}
