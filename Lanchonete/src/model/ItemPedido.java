/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sonia
 */
public class ItemPedido {
    private String nome;
    private double valor;

    public ItemPedido(String n, double v)
    {
        this.nome = n;
        this.valor = v;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void setValor (double valor){
        this.valor = valor;
    }

    public double getValor (){
        return this.valor;
    }
    
}
