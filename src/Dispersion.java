import java.util.LinkedList;

public class Dispersion {
    public static double range(LinkedList<Double> list){
        return list.get(list.size()-1)-list.get(0);
    }
    public static double variance(LinkedList<Double> list, double  median){
        double sum=0;
        for(Double est:list){
            sum+=Math.pow(est-median,2);
        }
        return (sum/(list.size()-1));
    }
    public static double standardDeviation(LinkedList<Double> list, double median){
        return Math.sqrt(variance(list, median));
    }
}
