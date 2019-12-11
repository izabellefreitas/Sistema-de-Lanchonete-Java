package view;

import java.util.ArrayList;
import control.Controlador;
import java.util.HashMap;
import java.util.Scanner;
import model.Cliente;

public class Lanchonete {

    private static String nomeClient;
    private static int pedidoClient;
    private static Controlador c = new Controlador();

    public static void main(String[] args) {
        
        System.out.println("LANCHONETE MISTER LANCHES");
        System.out.println("\n\nDigite o nome do cliente: ");

        Scanner s = new Scanner(System.in);
        nomeClient = s.next();
        
        System.out.println("\n\nDigite o numero da mesa: ");
        pedidoClient = s.nextInt();
        
        c.cadastrarCliente(nomeClient, pedidoClient);

        while (true)
        {
            System.out.println("\t\tMenu\n");
            System.out.println("\t1-Comidas\n");
            System.out.println("\t2-Bebidas\n");
            System.out.println("\t3-Sobremesas\n");
            System.out.println("\t4-Combos\n");
            System.out.println("\t5-Total\n");
            System.out.println("\t6-Sair\n");

            int opc = s.nextInt();
            switch(opc){
                case 1:
                    ViewComida.escolherComida(c, pedidoClient);
                    break;

                case 2:
                    ViewBebida.escolherBebida(c, pedidoClient);
                    break;

                case 3:
                    ViewSobremesa.escolherSobremesa(c, pedidoClient);
                    break;

                case 4:
                    ViewCombo.escolherCombo(c, pedidoClient);
                    break;

                case 5:
                    System.out.println(c.calculaTotal(pedidoClient));
                    break;

                default:
                    return;
            }
        }
    }
}
