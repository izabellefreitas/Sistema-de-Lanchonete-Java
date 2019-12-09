package view;

import java.util.ArrayList;
import control.Controlador;
import java.util.HashMap;
import java.util.Scanner;
import model.Cliente;

public class Lanchonete {

    private static Scanner s = new Scanner(System.in);
    private static String nomeClient;
    private static int pedidoClient;
    private static Controlador c = new Controlador();

    public static void main(String[] args) {
        
        System.out.println("SEJA BEM-VINDX A LANCHONETE MISTER LANCHES");
        System.out.println("\n\nDigite o seu nome: ");
        nomeClient = s.next();
        
        System.out.println("\n\nDigite o numero do pedido: ");
        pedidoClient = s.nextInt();
        
        c.cadastrarCliente(nomeClient, numP);

        while (true)
        {
            System.out.println("\t\tMenu\n");
            System.out.println("\t1-Comidas\n");
            System.out.println("\t2-Bebidas\n");
            System.out.println("\t3-Sobremesas\n");
            System.out.println("\t4-Combos\n");
            System.out.println("\t5-Total\n");
            System.out.println("\t6-Sair\n");

            opc = s.nextInt();
            switch(opc){
                case 1:
                escolherComida();
                break;

                case 2:
                escolherBebida();
                break;

                case 3:
                escolherSobremesa();
                break;

                case 4:
                escolherCombo();
                break;

                case 5:
                System.out.println(c.calculaTotal(pedidoClient));
                break;

                default:
                return;
            }
            
        }
    }

    private static void escolherComida(){

        while(true) { 
            System.out.println("\t\tMenu\n");
            System.out.println("\t1-Digite o nome da comida\n");
            System.out.println("\t2-Sair\n");

            opc = s.nextInt();
            switch(opc){
                case 1:
                imprimirMenuComida();

                String nomeComida = s.nextLine();
                c.addComida(pedidoClient, nomeComida);
                break;
                
                default:
                return;
            }
        }
    }

    private static void escolherBebida(){

        while(true) { 
            System.out.println("\t\tMenu\n");
            System.out.println("\t1-Digite o nome da bebida\n");
            System.out.println("\t2-Sair\n");

            opc = s.nextInt();
            switch(opc){
                case 1:
                imprimirMenuBebida();

                String nomeBebida = s.nextLine();
                c.addBebida(pedidoClient, nomeBebida);
                break;
                
                default:
                return;
            }
        }
    }

    private static void escolherSobremesa(){

        while(true) { 
            System.out.println("\t\tMenu\n");
            System.out.println("\t1-Digite o nome da sobremesa\n");
            System.out.println("\t2-Sair\n");

            opc = s.nextInt();
            switch(opc){
                case 1:
                imprimirMenuSobremesa();

                String nomeSobremesa = s.nextLine();
                c.addSobremesa(pedidoClient, nomeSobremesa);
                break;
                
                default:
                return;
            }
        }
    }

    private static void escolherCombo(){

        while(true) { 
            System.out.println("\t\tMenu\n");
            System.out.println("\t1-Digite o nome do combo\n");
            System.out.println("\t2-Sair\n");

            opc = s.nextInt();
            switch(opc){
                case 1:
                imprimirMenuCombo();

                String nomeCombo= s.nextLine();
                c.addCombo(pedidoClient, nomeCombo);
                break;
                
                default:
                return;
            }
        }
    }


    private static void imprimirMenuComida()
    {
        ArrayList<String> menuComida = c.retornaMenuComida();
        for (String comida : menuComida){
            System.out.println(comida);
        }
    }
    
    private static void imprimirMenuBebida()
    {
        ArrayList<String> menuBebida = c.retornaMenuBebida();
        for (String bebida : menuBebida){
            System.out.println(bebida);
        }
    }
    
    private static void imprimirMenuSobremesa()
    {
        ArrayList<String> menuSobremesa = c.retornaMenuSobremesa();
        for (String sobremesa : menuSobremesa){
            System.out.println(sobremesa);
        }
    }
     
    private static void imprimirMenuCombo()
    {
        ArrayList<String> menuCombo = c.retornaMenuCombo();
        for (String combo : menuCombo){
            System.out.println(combo);
        }
    } 

}
