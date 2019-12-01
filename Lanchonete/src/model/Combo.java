/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Combo {
    private Comida c;
    private Bebida b;
    private Double valor;
           
    public Combo (Comida com, Bebida beb, Double val){
        this.b=beb;
        this.c=com;
        this.valor=val;
    }
    
    public void setC (Comida c){
        this.c=c;
    }

    public Comida getC (){
        return this.c;
    }

    public void setB (Bebida b){
        this.b=b;
    }

    public Bebida getB (){
        return this.b;
    }
    
    public void setValor (Double valor){
        this.valor=valor;
    }

    public Double getValor (){
        return this.valor;
    }
      
    @Override
    public String toString()
    {
        return "\tPreco: RS " + this.valor;
    }    
}
