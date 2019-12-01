package model;

public class Bebida {
    private String sabor;
    private String tipoBebida;
    private int quantidade;
    private Double valor;
    private static final int[] listaQuant = {300, 400, 500, 700};

    public Bebida (String sab, String tipo, Double valor){
        this.sabor=sab;
        this.tipoBebida=tipo;
        this.valor=valor;
    }
    
    public Bebida (String sab, String tipo, int quant){
        this.sabor=sab;
        this.tipoBebida=tipo;
        this.quantidade=quant;
        
        for(int i = 0; i < 4; i++)
            if(quant == listaQuant[i])
                this.quantidade=quant;
    }
    
    public static int[] getListaQuant (){
        return listaQuant;
    }
    
    public void setSabor (String sabor){
        this.sabor=sabor;
    }
    
    public String getSabor (){
        return this.sabor;
    }
    
    public void setTipoBebida (String tipoBebida){
        this.tipoBebida=tipoBebida;
    }
    
    public String getTipoBebida (){
        return this.tipoBebida;
    }
    
    public void setValor (Double valor){
        this.valor=valor;
    }
    
    public Double getValor (){
        return this.valor;
    }
    
    public void setQuantidade (int quantidade){
        this.quantidade=quantidade;
    }
    
    public double getQuantidade (){
        return this.quantidade;
    }  
    
    @Override
    public String toString()
    {
        return "\tPreco: RS " + this.valor;
    }
    
    public double Beber (){
       return this.quantidade;
    }
}
