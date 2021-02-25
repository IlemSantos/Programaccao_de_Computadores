/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Programa para calcular a área de uma casa(e seus cômodos: uma sala de 11X11m,
 * um banheiro e um quarto de 5.5X7m cada), piscina e o valor da construção.
 * Programa com o uso de Métodos, Parâmetros, Atributos, Condicionais, operador '?', Switch e For Aninhado.
 *
 * @version 10
 * @author Ilem Santos
 */
public class AreaCasa_V9 {

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

    /**
     * Método valorPiscina para calcular custo da construção da piscina. O
     * método foi utilizado o Switch.
     */
    static double valorPiscina(double area, int material) {
        double valor;
        switch (material) {
            case ALVENARIA:
                valor = 1500;
                break;
            case VINIL:
                valor = 1100;
                break;
            case FIBRA:
                valor = 750;
                break;
            case PLASTICO:
                valor = 500;
                break;
            default:
                valor = -1;
        }
        return (area * valor);
    }

    public static void main(String[] args) {
        double areap;
        double preco;
        double area = 50;
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

        System.out.println("Área\tMaterial\tValor");
        for (area = 50; area <= 200; area += 50) {
            for (tipo = ALVENARIA; tipo <= PLASTICO; tipo += 1) {
                System.out.println(area + "\t" + tipo + "\t\t" + valorPiscina(area, tipo));
            }
        }
    }
}
