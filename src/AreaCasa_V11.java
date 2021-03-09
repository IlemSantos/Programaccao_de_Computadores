/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Programa para calcular a área de uma casa(e seus cômodos: uma sala de 11X11m,
 * um banheiro e um quarto de 5.5X7m cada), piscina e o valor da construção.
 * Programa com o uso de Métodos, Parâmetros, Atributos, Condicionais, operador '?', For Aninhado e Matriz.
 *
 * @version 12
 * @author Ilem Santos
 */
public class AreaCasa_V11 {

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

    //Matriz dos nomes dos materiais da piscina.
    static char[][] nomes = {{'A', 'l', 'v', 'e', 'r', 'n', 'a', 'r', 'i', 'a'}, {'V', 'i', 'n', 'i', 'l'}, {'F', 'i', 'b', 'r', 'a'}, {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}};

    //Carrega os valores das piscinas na matriz de área X material.
    public static void carregaVal(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 50; j <= 200; j += 50) {
                m[i][j / 50 - 1] = valorPiscina(j, i);
            }
        }
    }

    public static void main(String[] args) {
        double[][] valores = new double[4][4];
        double areap;
        double preco;
        double media = 0;

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
        System.out.print(nomes[2]);
        System.out.println(": " + valorPiscina(100, FIBRA));

        carregaVal(valores);

        for (double[] linha : valores) {
            for (double valor : linha) {
                System.out.print(valor + "  ");
            }
            System.out.println();
        }

    }
}
