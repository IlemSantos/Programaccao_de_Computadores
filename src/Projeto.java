
public class Projeto {

    Residencia[] condominio;
    int ultimo = -1; // último alocado

    boolean adicionaRes(Residencia r) {
        if (this.ultimo < this.condominio.length - 1) {
            ultimo++;
            this.condominio[ultimo] = r;
            return (true);
        }
        return (false);
    }

    Projeto(int tam) {
        condominio = new Residencia[tam];
    }

}
