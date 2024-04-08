package model;
import javax.swing.*;
/**
 *
 * @author 1072419633
 */
public class FormaGeometrica {
    private String cor;
    
    public FormaGeometrica(){
        this("");
    }
    public FormaGeometrica(String cor){
        setCor(cor);
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void leitura(){
        setCor(JOptionPane.showInputDialog("Digite a cor"));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"A cor é: " + getCor());
    }
    public String paraString(){
        return("Cor: "+ getCor());
    }
    public double getArea(){
        return 0;
    }
}
