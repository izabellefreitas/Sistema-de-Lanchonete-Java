package model;

import java.util.ArrayList;

public class Pedido{
    ArrayList<ItemPedido> itens = new ArrayList<>();
    private int numPedido;
    
    public double calculaTotal()
    {
        double soma = 0;
        for(ItemPedido item : itens)
        {
            soma += item.getValor();
        }
        return soma;
    }
    
    public void adicionarItem(ItemPedido item)
    {
        this.itens.add(item);
    }
    
   }
