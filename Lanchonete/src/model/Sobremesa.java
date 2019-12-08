package model;

public class Sobremesa implements ILanchonete
{
    private String saborSobremesa;
    private String tipoSobremesa;
    private String nome;
    private Double valor;
    
    public Sobremesa(String saborSob, String tipoSob, Double valor)
    {
        this.saborSobremesa = saborSob;
        this.tipoSobremesa = tipoSob;
        this.valor=valor;
    }
    
    public void setSaborSobremesa (String saborSobremesa){
        this.saborSobremesa = saborSobremesa;
    }
    
    public String getSaborSobremesa (){
        return this.saborSobremesa;
    }
    
    public void setTipoSobremesa (String tipoSobremesa){
        this.tipoSobremesa = tipoSobremesa;
    }
    
    public String getTipoSobremesa (){
        return this.tipoSobremesa;
    }
    
    public void setValor (Double valor){
        this.valor=valor;
    }

    public Double getValor (){
        return this.valor;
    }
    
     @Override
    public String getNome(){
        return this.nome;
    } 
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    @Override
    public String toString()
    {
        return "\tPreco: RS " + this.valor;
    }
 
}
