package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import model.*;

public class Controlador
{
    private HashMap<String, Comida> menuComida = new HashMap<>();
    private HashMap<String, Bebida> menuBebida = new HashMap<>();
    private HashMap<String, Sobremesa> menuSobremesa = new HashMap<>();
    private HashMap<String, Combo> menuCombo = new HashMap<>();
    private HashMap<Integer, Pedido> pedidos = new HashMap<>();
    private HashMap<String, Cliente> clientes = new HashMap<>();
    
    public Controlador()
    {
        preencherMenuComida();
        preencherMenuBebida();
        preencherMenuSobremesa();
        preencherMenuCombo();
    }
    
    public int criarPedido()
    {
        int numPedido = pedidos.size()+1;
        pedidos.put(numPedido, new Pedido());
        return numPedido;
    }

    public double calculaTotal(int numP)
    {
        return pedidos.get(numP).calculaTotal();
    }

    public void adicionarCarrinho(int numP, String nome, Double valor)
    {
        ItemPedido novo = new ItemPedido(nome,valor);
        
        Pedido aux = pedidos.get(numP);
        if (aux == null) {
            numP = criarPedido();
            aux = pedidos.get(numP);
        }
        aux.adicionarItem(novo);
    }
    
    public void addComida(int numP, String nome)
    {
        Comida aux = menuComida.get(nome);
        this.adicionarCarrinho(numP, nome, aux.getValor());
    }
    
    public void addBebida(int numP, String nome)
    {
        Bebida aux = menuBebida.get(nome);
        this.adicionarCarrinho(numP, nome, aux.getValor());
    }
    
    public void addCombo(int numP, String nome)
    {
        Combo aux = menuCombo.get(nome);
        this.adicionarCarrinho(numP, nome, aux.getValor());
    }
    
    public void addSobremesa(int numP, String nome)
    {
        Sobremesa aux = menuSobremesa.get(nome);
        this.adicionarCarrinho(numP, nome, aux.getValor());
    }
    
    private void preencherMenuComida()
    {
        this.menuComida.put("X-Tudao", new Sanduiche(
            "X-Tudao",
            "Pao de Hamburguer",
            "Alface, Tomate, Queijo e Bacon",
            "Picanha",
            "Barbecue",
            10.00
            )
        );

        this.menuComida.put("X-Burger", new Sanduiche(
            "X-Burger",
            "Pao de Hamburguer",
            "Alface, Tomate, Queijo",
            "Tradicional",
            "Barbecue",
            8.00
            )
        );
        
        this.menuComida.put("Coxinha", new Salgado(
            "Coxinha",    
            "Massa de Coxinha", 
            "Frango", 
            "Ketchup, Maionese e Mostarda",
            5.00
            )   
        );
        
        this.menuComida.put("Risole", new Salgado(
            "Risole",    
            "Massa de Risole", 
            "Carne", 
            "Ketchup, Maionese e Mostarda",
            5.00
            )   
        );

        this.menuComida.put("Croissant de Frango", new Salgado(
            "Croissant de Frango",    
            "Massa Folhada", 
            "Frango", 
            "Ketchup, Maionese e Mostarda",
            5.00
            )   
        );
        
        this.menuComida.put("Croissant de Queijo e Presunto", new Salgado(
            "Croissant de Queijo e Presunto",    
            "Massa Folhada", 
            "Queijo e Presunto", 
            "Ketchup, Maionese e Mostarda",
            5.00
            )   
        );
    }

    private void preencherMenuBebida()
    {
        this.menuBebida.put("Coca-cola", new Bebida("Cola", "refrigerante", 3.50));
        this.menuBebida.put("Guarana Antartica", new Bebida("Guarana", "Refrigerante", 3.50));
        this.menuBebida.put("Fanta Laranja", new Bebida("Laranja", "Refrigerante", 3.50));
        this.menuBebida.put("Fanta Uva", new Bebida("Uva", "Refrigerante", 3.50));
        this.menuBebida.put("Suco de Laranja", new Bebida("Laranja", "Suco", 3.50));
        this.menuBebida.put("Suco de Uva", new Bebida("Uva", "Suco", 3.50));
    }

    private void preencherMenuSobremesa()
    {
        this.menuSobremesa.put("Brownie de Chocolate",
            new Sobremesa("Chocolate", "Brownie", 3.00));
        
        this.menuSobremesa.put("Brownie de Doce de Leite",
            new Sobremesa("Doce de Leite", "Brownie", 3.00));
        
        this.menuSobremesa.put("Brownie de Nutella", 
            new Sobremesa("Nutella", "Brownie", 3.00));
        
        this.menuSobremesa.put("Brownie de Amendoim", 
            new Sobremesa("Amendoim", "Brownie", 3.00));
        
        this.menuSobremesa.put("Torta de Doce de Leite", 
            new Sobremesa("Doce de Leite", "Torta", 5.00));
        
        this.menuSobremesa.put("Torta de Chocolate", 
            new Sobremesa("Chocolate", "Torta", 5.00));
        
        this.menuSobremesa.put("Torta de Morango",
            new Sobremesa("Morango", "Torta", 5.00));
        
        this.menuSobremesa.put("Casquinha de Chocolate", 
            new Sobremesa("Chocolate", "Sorvete", 2.00));
        
        this.menuSobremesa.put("Casquinha de Baunilha", 
            new Sobremesa("Baunilha", "Sorvete", 2.00));
        
        this.menuSobremesa.put("Casquinha de Morango", 
            new Sobremesa("Morango", "Sorvete", 2.00));
        
        this.menuSobremesa.put("Casquinha Mista (C&B)", 
            new Sobremesa("Chocolate com Baunilha", "Sorvete", 2.00));
        
        this.menuSobremesa.put("Casquinha Mista (M&B)", 
            new Sobremesa("Morango com Baunilha", "Sorvete", 2.00));
    }

    private void preencherMenuCombo()
    {
        this.menuCombo.put("Combo 1 - X-Tudao + Coca-Cola",
            new Combo("Combo 1 - X-Tudao + Coca-Cola",
                this.menuComida.get("X-Tudao"),
                this.menuBebida.get("Guarana Antartica"), 12.00));
        
        this.menuCombo.put("Combo 2 - X-Tudao + Guarana Antartica",
            new Combo("Combo 2 - X-Tudao + Guarana Antartica",
                this.menuComida.get("X-Tudao"), 
                this.menuBebida.get("Coca-Cola"), 12.00));
        
        this.menuCombo.put("Combo 3 - X-Burguer + Guarana Antartica",
            new Combo("Combo 3 - X-Burguer + Guarana Antartica",
                this.menuComida.get("X-Burguer"),
                this.menuBebida.get("Guarana Antartica"), 10.00));
        
        this.menuCombo.put("Combo 4 - X-Burguer + Coca-Cola",
            new Combo("Combo 4 - X-Burguer + Coca-Cola",
                this.menuComida.get("X-Burguer"),
                this.menuBebida.get("Coca-Cola"), 10.00));
        
        this.menuCombo.put("Combo 5 - Coxinha + Coca-Cola",
            new Combo("Combo 5 - Coxinha + Coca-Cola",
                this.menuComida.get("Coxinha"),
                this.menuBebida.get("Coca-Cola"), 7.00));
        
        this.menuCombo.put("Combo 6 - Coxinha + Guarana Antartica",
            new Combo("Combo 6 - Coxinha + Guarana Antartica",
                this.menuComida.get("Coxinha"),
                this.menuBebida.get("Coca-Cola"), 7.00));
        
        this.menuCombo.put("Combo 7 - Risole + Coca-Cola",
            new Combo("Combo 7 - Risole + Coca-Cola",
                this.menuComida.get("Risole"),
                this.menuBebida.get("Coca-Cola"), 7.00));
        
        this.menuCombo.put("Combo 8 - Risole + Guarana Antartica",
            new Combo("Combo 8 - Risole + Guarana Antartica",
                this.menuComida.get("Risole"),
                this.menuBebida.get("Coca-Cola"), 7.00));
        
        this.menuCombo.put("Combo 9 - Croissant + Guarana Antartica",
            new Combo("Combo 9 - Croissant + Guarana Antartica",
                this.menuComida.get("Croissant"),
                this.menuBebida.get("Coca-Cola"), 7.00));
        
        this.menuCombo.put("Combo 10 - Croissant + Coca-Cola",
            new Combo("Combo 10 - Croissant + Coca-Cola",
                this.menuComida.get("Croissant"),
                this.menuBebida.get("Coca-Cola"), 7.00));
    }
    
    private ArrayList<String> retornaMenu(HashMap nome)
    {
        ArrayList<String> menu = new ArrayList<>();

        Set<String> chaves = nome.keySet();
        for (String chave : chaves) 
        {
            Object c = nome.get(chave);
            menu.add("Nome: " + chave + c.toString());
        }

        return menu;
    }
    
    public ArrayList<String> retornaMenuComida()
    {
        return this.retornaMenu(this.menuComida);
    }
    
    public ArrayList<String> retornaMenuBebida()
    {
        return this.retornaMenu(menuBebida);
    }
    
    public ArrayList<String> retornaMenuSobremesa()
    {
        return this.retornaMenu(menuSobremesa);
    }
    
    public ArrayList<String> retornaMenuCombo()
    {
        return this.retornaMenu(menuCombo);
    }

    public void cadastrarCliente(String nome, int numP)
    {
        Cliente c = new Cliente(nome, numP);
        this.clientes.put(nome, c);
    }

}