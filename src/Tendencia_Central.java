import java.util.LinkedList;

public class Tendencia_Central {
    public static double ArithmeticMean(LinkedList<Double> list) {
        double sum=0;
        for(Double est: list){
            sum+=est;
        }
        return sum/list.size();
    }
}
