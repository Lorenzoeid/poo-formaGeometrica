package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(){
        this("",0);
    }
    public Circulo(String cor, double raio){
        super(cor);
        setRaio(raio);
    }
    public double getRaio(){ return raio; }
    public void setRaio(double raio){ this.raio = raio; }
    
    public void leitura(){
        super.leitura();
        setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));
    }
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null,"O raio é: "+getRaio());
    }
    public String paraString(){
        return(super.paraString() + "/ raio: " + getRaio());
    }
    public double getArea(){
        return(Math.PI * getRaio() * getRaio());
    }
}
