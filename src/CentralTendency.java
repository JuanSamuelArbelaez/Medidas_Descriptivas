import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CentralTendency {
    public static double ArithmeticMean(LinkedList<Double> list) {
        double sum=0;
        for(Double est: list){
            sum+=est;
        }
        return sum/list.size();
    }
    public static double Median(LinkedList<Double> list) {
        if(list.size()%2==0) return (list.get(list.size()/2)+list.get((list.size()+2)/2))/2;
        else return list.get((list.size()+1)/2);
    }
    public static List<Double> Mode(LinkedList<Double> list){
        Map<Double, Integer> counts = new HashMap<>();
        for (Double value : list) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

        // Find the maximum count
        int maxCount = 0;
        for (int count : counts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Find the values with the maximum count
        List<Double> result = new LinkedList<>();
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
