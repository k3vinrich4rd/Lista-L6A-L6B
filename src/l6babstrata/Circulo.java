package l6babstrata;

public class Circulo extends CalculoAreaGeo {
    public Circulo(){
        super();
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setPi(3.14);
        circulo.setRaioCirculo(300);
        System.out.println("O resultado da area do circulo é: " + circulo.areaCirculo());
    }
}
