package l6babstrata;

public class Retangulo extends CalculoAreaGeo {

    public Retangulo(){
        super();
    }
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(20);
        retangulo.setBase(2);
        System.out.println("O valor da area do retângulo é: " + retangulo.areRetangulo() );
    }
}
