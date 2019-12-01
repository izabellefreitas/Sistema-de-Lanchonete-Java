/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Pedido {
    ArrayList<ItemPedido> itens = new ArrayList<>();

    public double calculaTotal()
    {
        double soma = 0;
        for(ItemPedido item : itens)
        {
            soma = soma + item.getValor();
        }
        return soma;
    }
}
