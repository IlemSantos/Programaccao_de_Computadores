
public class TesteProjeto {

    public static void main(String[] args) {
        Projeto proj = new Projeto(3);

        AreaCasa c = new AreaCasa(10, 5);
        AreaPiscina p = new AreaPiscina(5);
        Residencia r = new Residencia(c, p);
        proj.adicionaRes(r);

        c = new AreaCasa(12, 7);
        p = new AreaPiscina(6);
        r = new Residencia(c, p);
        proj.adicionaRes(r);

        c = new AreaCasa(10, 6);
        p = new AreaPiscina(3.5);
        r = new Residencia(c, p);
        proj.adicionaRes(r);

    }

}
