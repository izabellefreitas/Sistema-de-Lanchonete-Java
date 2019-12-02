package model;

public class Sanduiche extends Comida{
    private String pao;
    private String recheio;

    public Sanduiche(String nome,String pao, String recheio, String carne, String molho, Double valor){
        super(nome, carne, molho, valor);
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
