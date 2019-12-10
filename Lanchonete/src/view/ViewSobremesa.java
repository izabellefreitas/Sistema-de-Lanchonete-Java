package view;

import control.Controlador;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewSobremesa {

    protected static void escolherSobremesa(Controlador c, int pedidoClient){

        while(true) {
            imprimirMenuSobremesa(c);

            System.out.println("\n\t\tMenu\n");
            System.out.println("\t1-Digitar o nome da sobremesa\n");
            System.out.println("\t2-Voltar ao menu\n");

            Scanner s = new Scanner(System.in);
            int opc = s.nextInt();
            switch(opc){
                case 1:
                    Scanner sc = new Scanner(System.in);

                    String nomeSobremesa = sc.nextLine();
                    c.addSobremesa(pedidoClient, nomeSobremesa);
                    break;

                default:
                    return;
            }
        }
    }

    protected static void imprimirMenuSobremesa(Controlador c)
    {
        ArrayList<String> menuSobremesa = c.retornaMenuSobremesa();
        menuSobremesa.forEach(sobremesa -> System.out.println(sobremesa));
    }
}
