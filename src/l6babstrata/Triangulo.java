package l6babstrata;

public class Triangulo extends CalculoAreaGeo {
    public Triangulo(){
        super();
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(20);
        triangulo.setAltura(20);
        System.out.println("A area do triângulo é: " + triangulo.areaTriang());
    }


    }



