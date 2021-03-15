
public class AreaCasa {

    /* valor do metro quadrado da casa */
    double valorM2 = 1500;

    /* comprimento da lateral da sala */
    double lateral = 10;

    /* comprimento da lateral maior do quarto */
    double cquarto = 10;

    /* Construtores */
    AreaCasa() {
    }

    AreaCasa(double valorM2) {
        this.valorM2 = valorM2;
    }

    AreaCasa(double lateral, double cquarto) {
        this.lateral = lateral;
        this.cquarto = cquarto;
    }

    AreaCasa(double lateral, double cquarto, double valorM2) {
        this(lateral, cquarto);
        this.valorM2 = valorM2;
    }

    /* Calcula a área da casa */
    double area() {
        double areat = -1;    // área total
        if (this.lateral >= 0 && this.cquarto >= 0) {
            areat = this.lateral * this.lateral;
            areat += this.cquarto * this.lateral;

        }
        return (areat);
    }

    /* Calcula o valor total da construção */
    double valor(double area) {
        return ((area >= 0) ? (this.valorM2 * area) : (-1));//O operador '?'
    }
}
