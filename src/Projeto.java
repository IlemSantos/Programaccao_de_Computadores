
public class Projeto {

    static double area(AreaCasa casa, AreaPiscina piscina) {
        return (casa.area() + piscina.area());
    }

    public static void main(String[] args) {
        AreaCasa casa1 = new AreaCasa(10, 5);
        AreaCasa casa2 = new AreaCasa(20, 5);
        AreaPiscina piscina1 = new AreaPiscina(10);

        System.out.println(area(casa1, piscina1));
    }

}
