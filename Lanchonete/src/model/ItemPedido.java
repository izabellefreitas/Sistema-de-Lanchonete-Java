package model;

public class ItemPedido {
    private String nome;
    private double valor;
    private Cliente client;

    public ItemPedido(String nome, double valor, Cliente client)
    {
        this.nome = nome;
        this.valor = valor;
        this.client = client;
    }

    public ItemPedido(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }
    
    public void setClient(Cliente client){
        this.client = client;
    }
    
    public Cliente getClient(){
        return this.client;
    }
}
