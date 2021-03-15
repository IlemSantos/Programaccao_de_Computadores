
public class AreaPiscina {

    /* materiais da piscina */
    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;

    public double[] precos;
    public double raio;

    /* nomes dos materiais da piscina. */
    static char[][] nomes = {{'A', 'l', 'v', 'e', 'r', 'n', 'a', 'r', 'i', 'a'}, {'V', 'i', 'n', 'i', 'l'}, {'F', 'i', 'b', 'r', 'a'}, {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}};

    /* Construtores */
    /* Construtor padrão do preços dos materiais para construção da piscina */
    AreaPiscina() {
        double[] aux = {1500, 1100, 750, 500};
        this.precos = aux;
        this.raio = 10;
    }

    /* Construtor do preços dos materiais para construção da piscina */
    AreaPiscina(double[] precos) {
        this.precos = precos;
        this.raio = 10;
    }

    AreaPiscina(double raio) {
        this();
        this.raio = raio;
    }

    AreaPiscina(double[] precos, double raio) {
        this.precos = precos;
        this.raio = raio;
    }

    /* Calcula a área da piscina */
    double area() {
        return (this.raio >= 0) ? (Math.PI * Math.pow(this.raio, 2)) : (-1);//O operador '?'
    }

    /* Calcula o valor da construção da piscina */
    double valor(double area, int material) {
        if (material < ALVENARIA || material > PLASTICO || area < 0) {
            return (-1);
        }
        return (area * precos[material]);
    }

    /* Carrega os valores das piscinas na matriz de área X material. */
    void carregaVal(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 50; j <= 200; j += 50) {
                m[i][j / 50 - 1] = valor(j, i);
            }
        }
    }

    /* Retorna matriz com os preços finais. */
    public static double[][] calculaFinal(double[][] val, double[][] desc) {
        double[][] saida = new double[val.length][val[0].length];
        for (int i = 0; i < saida.length; i++) {
            for (int j = 0; j < saida[0].length; j++) {
                saida[i][j] = val[i][j] * (1 - desc[i][j]);
            }
        }
        return (saida);

    }

}
