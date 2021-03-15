
public class Projeto {

    public static void main(String[] args) {
        AreaCasa casa1 = new AreaCasa();
        AreaCasa casa2 = new AreaCasa(1270);

        System.out.println(casa1.valor(casa1.area(15, 10)));

        System.out.println(casa2.valor(casa2.area(15, 10)));
    }

}
