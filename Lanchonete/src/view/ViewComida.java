package view;

import control.Controlador;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewComida {

    protected static void escolherComida(Controlador c, int pedidoClient){

        while(true) {
            imprimirMenuComida(c);

            System.out.println("\n\t\tMenu\n");
            System.out.println("\t1-Digitar o nome da comida\n");
            System.out.println("\t2-Voltar ao menu\n");

            Scanner s = new Scanner(System.in);
            int opc = s.nextInt();

            switch(opc){
                case 1:
                    Scanner sc = new Scanner(System.in);

                    String nomeComida = sc.nextLine();
                    c.addComida(pedidoClient, nomeComida);
                    break;

                default:
                    return;
            }
        }
    }

    protected static void imprimirMenuComida(Controlador c)
    {
        ArrayList<String> menuComida = c.retornaMenuComida();
        menuComida.forEach(comida -> System.out.println(comida));
    }
}
