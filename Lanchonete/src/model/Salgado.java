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
public class Salgado extends Comida{
    private String massa;
    
    public Salgado (String massa, String carne, String molho, Double valor){
        super(carne, molho, valor);
        this.massa = massa;
    }
    
    public void setMassa (String massa){
        this.massa=massa;
    }
    public String getMassa (){
        return this.massa;
    }  
     
}
