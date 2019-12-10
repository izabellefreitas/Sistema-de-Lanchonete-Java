package view;

import control.Controlador;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewBebida {

    protected static void escolherBebida(Controlador c, int pedidoClient){

        while(true) {
            imprimirMenuBebida(c);

            System.out.println("\n\t\tMenu\n");
            System.out.println("\t1-Digitar o nome da bebida\n");
            System.out.println("\t2-Voltar ao menu\n");

            Scanner s = new Scanner(System.in);
            int opc = s.nextInt();
            switch(opc)
            {
                case 1:
                    Scanner sc = new Scanner(System.in);

                    String nomeBebida = sc.nextLine();
                    c.addBebida(pedidoClient, nomeBebida);
                    break;

                default:
                    return;
            }
        }
    }
    protected static void imprimirMenuBebida(Controlador c)
    {
        ArrayList<String> menuBebida = c.retornaMenuBebida();
        menuBebida.forEach(bebida -> System.out.println(bebida));
    }
}
