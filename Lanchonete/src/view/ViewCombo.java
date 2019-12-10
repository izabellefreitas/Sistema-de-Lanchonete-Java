package view;

import control.Controlador;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewCombo {

    protected static void escolherCombo(Controlador c, int pedidoClient){

        while(true) {
            imprimirMenuCombo(c);

            System.out.println("\n\t\tMenu\n");
            System.out.println("\t1-Digitar o nome do combo\n");
            System.out.println("\t2-Voltar ao menu\n");

            Scanner s = new Scanner(System.in);
            int opc = s.nextInt();
            switch(opc){
                case 1:
                    Scanner sc = new Scanner(System.in);

                    String nomeCombo= sc.nextLine();
                    c.addCombo(pedidoClient, nomeCombo);
                    break;

                default:
                    return;
            }
        }
    }
    protected static void imprimirMenuCombo(Controlador c)
    {
        ArrayList<String> menuCombo = c.retornaMenuCombo();
        menuCombo.forEach(combo -> System.out.println(combo));
    }
}
