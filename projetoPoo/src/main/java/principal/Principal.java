package principal;
import model.Circulo;
import model.Triangulo;

/**
 *
 * @author 1072419633
 */
public class Principal {
    public static void main(String[] args){
        
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        System.out.println("area do triangulo: "+ triangulo.getArea());
        
        Circulo circulo = new Circulo();
        circulo.leitura();
        System.out.println("area do circulo: "+ circulo.getArea());
    }
}
