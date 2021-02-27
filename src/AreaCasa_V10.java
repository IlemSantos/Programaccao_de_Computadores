/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Programa para calcular a área de uma casa(e seus cômodos: uma sala de 11X11m,
 * um banheiro e um quarto de 5.5X7m cada), piscina e o valor da construção.
 * Programa com o uso de Métodos, Parâmetros, Atributos, Condicionais, operador '?', For Aninhado e Arranjos.
 *
 * @version 11
 * @author Ilem Santos
 */
public class AreaCasa_V10 {

    static double valorM2 = 1500;//Atributo
    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;

    //Método areaCasa com uso de parâmetro
    static void areaCasa(float lateral, float cquarto) {
        if (lateral >= 0 && cquarto >= 0) {
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
        } else {
            System.out.println("Erro: Parâmetro");
        }
    }

    //Método valor
    static double valor(double area) {
        return ((area >= 0) ? (valorM2 * area) : (-1));//O operador '?'
    }

    //Método areaPiscina agora deve receber um valor(argumento) em seu parâmetro.
    static double areaPiscina(double raio) {
        return (raio >= 0) ? (Math.PI * Math.pow(raio, 2)) : (-1);//O operador '?'
    }

    //Arranjo dos preços dos materiais para construção da piscina.
    static double[] precos = {1500, 1100, 750, 500};

    //Método valorPiscina para calcular custo da construção da piscina.
    static double valorPiscina(double area, int material) {
        if (material < ALVENARIA || material > PLASTICO || area < 0) {
            return (-1);
        }
        return (area * precos[material]);
    }

    //Arranjo dos nomes dos materiais da piscina.
    static char[] nAlvernaria = {'A', 'l', 'v', 'e', 'r', 'n', 'a', 'r', 'i', 'a'};
    static char[] nVinil = {'V', 'i', 'n', 'i', 'l'};
    static char[] nFibra = {'F', 'i', 'b', 'r', 'a'};
    static char[] nPlastico = {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'};

    public static void main(String[] args) {
        double areap;
        double preco;
        double area = 50;
        double media = 0;
        int tipo;

        areaCasa(11, 7); //a partir deste ponto, chamar o método areaCasa e executar o método com uso de parâmetro

        areap = areaPiscina(2); //Note que areaPiscina() retorna valor, então guardamos esse valor em areap com uso de parâmetro
        System.out.println("A área da piscina é " + areap);

        preco = valor(20);
        if (preco >= 0) {
            System.out.println("O valor da construção é " + preco);
        } else {
            System.out.println("Valor da área negativo");
        }

        for (double valor : precos) {
            media += valor;
        }
        media = media / precos.length;
        System.out.println("O preço médio dos materiais de construção da piscina é " + media);

        System.out.print("Piscina de ");
        System.out.print(nFibra);
        System.out.println(": " + valorPiscina(100, FIBRA));
    }
}
