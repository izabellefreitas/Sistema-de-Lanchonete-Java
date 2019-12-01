package view;

import java.util.ArrayList;

import control.Controlador;

public class Lanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controlador c = new Controlador();
               
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
