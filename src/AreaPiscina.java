/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Programa para calcular a área da piscina
 * @author Ilem Santos
 */
public class AreaPiscina {
    public static void main(String[]args){
        double raio = 2; //raio da piscina
        double areap; //área da piscina
        areap = Math.PI*Math.pow(raio,2);
        System.out.println("A área da piscina é " +areap);
    }
}
