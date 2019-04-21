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
        //@version 3
        /*VANTAGEM?
        *Reduz nossa dependência a valores extrenos: antes eram 3(10,7e5),agora são 2(10e7)
        *Reduz a chance de erros na substituição
        *DESVANTAGEM?
        *Gasta mais memória,com as variáveis lateral e cquato
        */
        int lateral = 10; //comprimento da lateral da cabana
        int cquarto = 7; //comprimento da lateral maior do quarto
        int areaq; //área do quarto
        int areas; //área da sala
        int areat; //área total
        System.out.println("@version 3");
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
