/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Programa para calcular a área de uma casa(e seus cômodos:uma sala de 10X10m,
 * um banheiro e um quarto de 5X7m cada.
 * @author Ilem Santos
 * @version 1
 */
class AreaCasa {
    public static void main(String[]args){
        //@version 2
        int areaq; //área do quarto
        int areas; //área da sala
        int areat; //área total
        System.out.println("\n@version 2");
        System.out.println("Programa para cálculo da área da casa");
        areas = 10*10;
        System.out.println("A área da sala é "+ areas);
        areaq = 5*7;
        System.out.println("A área do quarto é "+ areaq);
        System.out.println("A área do banheiro é "+ areaq);
        areat= areas + 2*areaq;
        System.out.println("A área total é "+ areat);
   }
}
