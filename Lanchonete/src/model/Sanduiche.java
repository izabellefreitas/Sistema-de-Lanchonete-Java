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
public class Sanduiche extends Comida{
    private String pao;
    private String recheio;

    public Sanduiche(String pao, String recheio, String carne, String molho, Double valor){
        super(carne, molho, valor);
        this.pao = pao;
        this.recheio = recheio;
    }
    
    public void setPao (String pao){
        this.pao=pao;
    }
    public String getPao (){
        return this.pao;
    }  
    public void setRecheio (String recheio){
        this.recheio=recheio;
    }
    public String getRecheio (){
        return this.recheio;
    }  
    
}
