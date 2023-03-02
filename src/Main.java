import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> list = new LinkedList<>();
        list.add(149.0);
        list.add(150.0);
        list.add(151.0);
        list.add(153.0);
        list.add(154.0);
        list.add(156.0);
        list.add(156.0);
        list.add(159.0);
        list.add(160.0);
        list.add(160.0);

        list.add(160.0);
        list.add(160.0);
        list.add(160.0);
        list.add(160.0);
        list.add(160.0);
        list.add(160.0);
        list.add(160.0);
        list.add(161.0);
        list.add(161.0);
        list.add(161.0);

        list.add(162.0);
        list.add(162.0);
        list.add(162.0);
        list.add(163.0);
        list.add(163.0);
        list.add(164.0);
        list.add(166.0);
        list.add(166.0);
        list.add(167.0);
        list.add(167.0);

        list.add(168.0);
        list.add(168.0);
        list.add(169.0);
        list.add(169.0);
        list.add(169.0);
        list.add(169.0);
        list.add(170.0);
        list.add(170.0);
        list.add(170.0);
        list.add(170.0);

        list.add(171.0);
        list.add(172.0);
        list.add(172.0);
        list.add(172.0);
        list.add(172.0);
        list.add(173.0);
        list.add(173.0);
        list.add(173.0);
        list.add(174.0);
        list.add(174.0);

        list.add(175.0);
        list.add(175.0);
        list.add(176.0);
        list.add(176.0);
        list.add(178.0);
        list.add(178.0);
        list.add(179.0);
        list.add(179.0);
        list.add(182.0);
        list.add(184.0);

        System.out.println("media: "+Tendencia_Central.ArithmeticMean(list));

        System.out.println("rango: "+Dispersion.range(list));

        System.out.println("varianza: "+Dispersion.Variance(list));

        System.out.println("desviacion: "+Dispersion.StandardDeviation(list));

        System.out.println("cuartil 1: "+Position.Quartile(list,1));

        System.out.println("decil 8: "+Position.Decile(list,8));

        System.out.println("percentil 43: "+Position.Percentile(list,43));
    }
}