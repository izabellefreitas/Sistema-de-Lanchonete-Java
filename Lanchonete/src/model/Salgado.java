package model;

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
