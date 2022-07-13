package l6babstrata;

public class CalculoAreaGeo {
    private double ladoQuadrado;
    private double base;
    private double altura;
    private double pi;
    private double raioCirculo;

    public CalculoAreaGeo() {
        this.ladoQuadrado = ladoQuadrado;
        this.base = base;
        this.altura = altura;
        this.pi = 3.14;
        this.raioCirculo = raioCirculo;
    }

    public double areaDoQuadrado() {
        return this.ladoQuadrado * this.ladoQuadrado;
    }

    public double areRetangulo() {
        return this.base * this.altura;
    }

    public double areaTriang() {
        return (this.base * this.altura) / 2;
    }

    public double areaCirculo() {
        return this.pi * (this.raioCirculo * this.raioCirculo);

    }

    public double getLadoQuadrado() {
        return ladoQuadrado;
    }

    public void setLadoQuadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaioCirculo() {
        return raioCirculo;
    }

    public void setRaioCirculo(double raioCirculo) {
        this.raioCirculo = raioCirculo;
    }
}
