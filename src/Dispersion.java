import java.util.LinkedList;

public class Dispersion {
    public static double Range(LinkedList<Double> list){
        return list.get(list.size()-1)-list.get(0);
    }
    public static double Variance(LinkedList<Double> list){
        double median= CentralTendency.ArithmeticMean(list);
        double sum=0;
        for(Double est:list){
            sum+=Math.pow(est-median,2);
        }
        return (sum/(list.size()-1));
    }
    public static double StandardDeviation(LinkedList<Double> list){
        return Math.sqrt(Variance(list));
    }
}
