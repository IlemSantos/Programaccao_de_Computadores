
public class AreaCasa {

    double valorM2;

    /* Construtor que chama outro constrtor */
    AreaCasa() {
        this(1500.0); // chamar outro construtor com parâmetro
    }

    /* Construtor padrão */
    AreaCasa(double valorM2) {
        this.valorM2 = valorM2;
    }


    /* Calcula a área da casa */
    double area(double lateral, double cquarto) {
        double areat = -1;    // área total
        if (lateral >= 0 && cquarto >= 0) {
            areat = lateral * lateral;
            areat += cquarto * lateral;

        }
        return (areat);
    }

    /* Calcula o valor total da construção */
    double valor(double area) {
        return ((area >= 0) ? (valorM2 * area) : (-1));//O operador '?'
    }
}
