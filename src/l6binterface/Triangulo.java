package l6binterface;

public class Triangulo implements FiguraGeometrica {
    @Override
    public void calculoGeometrico() {
        double baseTriangulo = 5;
        double alturaTriangulo = 5;
        double areaTriangulo = 3;

        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("O resultado da area do triangulo é: " + areaTriangulo);
    }
}
