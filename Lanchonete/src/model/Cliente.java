package model;

public class Cliente {
    private String nomeCliente;
    private int numPedido;
    
    public Cliente(String nomeCliente, int numPedido){
        this.nomeCliente = nomeCliente;
        this.numPedido = numPedido;
    }
    
    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente=nomeCliente;
    }
    
    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    
    public void setNumPedido(int numPedido)
    {
        this.numPedido=numPedido;
    }
    
    public int getNumPedido()
    {
        return this.numPedido;
    }
}
