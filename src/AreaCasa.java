/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Programa para calcular a área de uma casa(e seus cômodos:uma sala de 11X11m,
 * um banheiro e um quarto de 5.5X7m cada) é uma piscina.
 * Programa com junção dois programas AreaCasa é AreaPiscina.
 * @author Ilem Santos
 * @version 2
 */
class AreaCasa {
    public static void main(String[]args){
        //@version 4
        float lateral = 11;//comprimento da lateral da cabana alterado
        float cquarto = 7;//comprimento da lateral maior do quarto
        float areaq;//área do quarto
        float areas;//área da sala
        float areat;//área total
        
        System.out.println("Programa para cálculo da área da casa");
        areas = lateral*lateral;
        System.out.println("A área da sala é " + areas);
        areaq = cquarto*(lateral/2);
        System.out.println("A área do quarto é " +areaq);
        System.out.println("A área do banheiro é " +areaq);
        areat= areas + 2*areaq;
        System.out.println("A área total é " +areat);
        
        double raio = 2; //raio da piscina
        double areap; //área da piscina
        areap = Math.PI*Math.pow(raio,2);
        System.out.println("A área da piscina é " +areap);
   }
}
