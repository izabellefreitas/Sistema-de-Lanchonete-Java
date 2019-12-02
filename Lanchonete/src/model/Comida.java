package model;

public abstract class Comida implements ILanchonete {
    private String nome;
    private String carne;
    private String molho;
    private Double valor;
    
    public Comida(String nome, String carne, String molho, Double valor)
    {
        this.nome = nome;
        this.carne = carne;
        this.molho = molho;
        this.valor = valor;
    }
    
    public void setCarne (String carne){
        this.carne=carne;
    }

    public String getCarne (){
        return this.carne;
    } 

    public void setMolho (String molho){
        this.molho=molho;
    }

    public String getMolho (){
        return this.molho;
    }  

    public void setValor (Double valor){
        this.valor=valor;
    }
    
    @Override
    public Double getValor (){
        return this.valor;
    }
    
    @Override
    public String getNome()
    {
        return this.nome;
    }
      
    @Override
    public String toString()
    {
        return "\tPreco: RS " + this.valor;
    }

}
