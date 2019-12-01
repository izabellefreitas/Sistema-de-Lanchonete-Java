package view;

import java.util.ArrayList;
import control.Controlador;
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        
        Controlador c = new Controlador();
        Scanner nomeCliente  = new Scanner(System.in);
        Scanner cpfCliente  = new Scanner(System.in);
        Scanner pedido = new Scanner(System.in);
        String nomeClient;
        int cpfClient;
        String pedidoClient;
        
        System.out.println("SEJA BEM-VINDX A LANCHONETE MISTER LANCHES");
        System.out.println("\n\nDigite o seu nome: ");
        nomeClient = nomeCliente.next();
        System.out.println("\nDigite o seu cpf: ");
        cpfClient = cpfCliente.nextInt();
        
        System.out.println("\t\tMenu\n");
        System.out.println("\tComidas\n");
        imprimirMenuComida(c);
        System.out.println("\n\tBebidas\n");
        imprimirMenuBebida(c);
        System.out.println("\n\tSobremesas\n");
        imprimirMenuSobremesa(c);
        System.out.println("\n\tCombos\n");
        imprimirMenuCombo(c);
        
        System.out.println("\n\nInforme o seu pedido: ");
        pedidoClient = pedido.next();
    }

    private static void imprimirMenuComida(Controlador c)
    {
        ArrayList<String> menuComida = c.retornaMenuComida();
        for (String comida : menuComida){
            System.out.println(comida);
        }
    }
    
    private static void imprimirMenuBebida(Controlador c)
    {
        ArrayList<String> menuBebida = c.retornaMenuBebida();
        for (String bebida : menuBebida){
            System.out.println(bebida);
        }
    }
    
    private static void imprimirMenuSobremesa(Controlador c)
    {
        ArrayList<String> menuSobremesa = c.retornaMenuSobremesa();
        for (String sobremesa : menuSobremesa){
            System.out.println(sobremesa);
        }
    }
     
    private static void imprimirMenuCombo(Controlador c)
    {
        ArrayList<String> menuCombo = c.retornaMenuCombo();
        for (String combo : menuCombo){
            System.out.println(combo);
        }
    } 
}
