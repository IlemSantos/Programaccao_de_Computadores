/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Programa para calcular a área de uma casa(e seus cômodos: uma sala de 11X11m,
 * um banheiro e um quarto de 5.5X7m cada), piscina e o valor da construção.
 * Programa com o uso de Métodos, Parâmetros e Atributos.
 *
 * @version 5
 * @author Ilem Santos
 */
public class AreaCasa_V4 {

    static double valorM2 = 1500;//Atributo

    //Método areaCasa com uso de parâmetro
    static void areaCasa(float lateral, float cquarto) {
        float areaq;
        float areas;
        float areat;

        System.out.println("Programa para cálculo da área da casa");
        areas = lateral * lateral;
        System.out.println("A área da sala é " + areas);
        areaq = cquarto * (lateral / 2);
        System.out.println("A área do quarto é " + areaq);
        System.out.println("A área do banheiro é " + areaq);
        areat = areas + 2 * areaq;
        System.out.println("A área total é " + areat);
    }

    //Método areaPiscina agora deve receber um valor(argumento) em seu parâmetro.
    static double areaPiscina(double raio) {
        return (Math.PI * Math.pow(raio, 2));
    }

    //Método valor
    static double valor(double area) {
        return (valorM2 * area);
    }

    public static void main(String[] args) {
        double areap;
        double preco;

        areaCasa(11, 7); //a partir deste ponto,chamar o método areaCasa e executar o método com uso de parâmetro

        areap = areaPiscina(2); //Note que areaPiscina() retorna valor,então guardamos esse valor em areap com uso de parâmetro
        System.out.println("A área da piscina é " + areap);

        preco = valor(-20);
        System.out.println("O valor da construção é " + preco);
    }
}
