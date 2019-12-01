package model;

public class Sobremesa {
    private String saborSobremesa;
    private String tipoSobremesa;
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
    public String toString()
    {
        return "\tPreco: RS " + this.valor;
    }
}
