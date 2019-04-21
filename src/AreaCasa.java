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
        //@version 4
        float lateral = 11;//comprimento da lateral da cabana alterado
        float cquarto = 7;//comprimento da lateral maior do quarto
        float areaq;//área do quarto
        float areas;//área da sala
        float areat;//área total
        System.out.println("@version 4");
        System.out.println("Programa para cálculo da área da casa");
        areas = lateral*lateral;
        System.out.println("A área da sala é " + areas);
        areaq = cquarto*(lateral/2);
        System.out.println("A área do quarto é " +areaq);
        System.out.println("A área do banheiro é " +areaq);
        areat= areas + 2*areaq;
        System.out.println("A área total é " +areat);
   }
}
