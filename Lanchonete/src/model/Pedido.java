package model;

import java.util.ArrayList;

public class Pedido {
    ArrayList<ItemPedido> itens = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    public double calculaTotal()
    {
        double soma = 0;
        for(Cliente cliente : clientes)
        {
            for(ItemPedido item : itens)
            {
                soma += item.getValor();
            }
        }
        return soma;
    }
    
}
