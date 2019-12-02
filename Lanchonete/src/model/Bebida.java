package model;

public class Bebida implements ILanchonete{
    private String sabor;
    private String nome;
    private int quantidade;
    private Double valor;
    private static final int[] listaQuant = {300, 400, 500, 700};

    public Bebida (String sab, String tipo, Double valor){
        this.sabor=sab;
        this.nome=tipo;
        this.valor=valor;
    }
    
    public Bebida (String nome, String sab, String tipo, int quant){
        this.nome=nome;
        this.sabor=sab;
        this.nome=tipo;
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
    
    public void setNome (String tipoBebida){
        this.nome=tipoBebida;
    }
    
    @Override
    public String getNome (){
        return this.nome;
    }
    
    public void setValor (Double valor){
        this.valor=valor;
    }
    
    @Override
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
