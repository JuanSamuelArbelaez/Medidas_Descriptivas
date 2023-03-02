import java.util.LinkedList;

public class Position {
    public static double Quartile(LinkedList<Double> list, int quartile)throws IllegalArgumentException{
        if(quartile < 1 || quartile > 3) throw new IllegalArgumentException("Quartile must be in between 1 and 3");
        if(list.isEmpty()) throw new IllegalArgumentException("List must not be empty");

        double position = calculatePosition(list.size(), 4, quartile)-1;
        int floorPos = (int) Math.floor(position), ceilPos = (int) Math.ceil(position);
        double floorValue = list.get(floorPos), ceilValue = list.get(ceilPos);
        return solveValue(floorPos, ceilPos, floorValue, ceilValue, position);
    }
    public static double Decile(LinkedList<Double> list, int decile)throws IllegalArgumentException{
        if(decile < 1 || decile > 9) throw new IllegalArgumentException("Decile must be in between 1 and 9");
        if(list.isEmpty()) throw new IllegalArgumentException("List must not be empty");

        double position = calculatePosition(list.size(), 10, decile)-1;
        int floorPos = (int) Math.floor(position), ceilPos = (int) Math.ceil(position);
        double floorValue = list.get(floorPos), ceilValue = list.get(ceilPos);
        return solveValue(floorPos, ceilPos, floorValue, ceilValue, position);
    }
    public static double Percentile(LinkedList<Double> list, int percentile)throws IllegalArgumentException{
        if(percentile < 1 || percentile > 99) throw new IllegalArgumentException("Percentile must be in between 1 and 99");
        if(list.isEmpty()) throw new IllegalArgumentException("List must not be empty");

        double position = calculatePosition(list.size(), 100, percentile)-1;
        int floorPos = (int) Math.floor(position), ceilPos = (int) Math.ceil(position);
        double floorValue = list.get(floorPos), ceilValue = list.get(ceilPos);
        return solveValue(floorPos, ceilPos, floorValue, ceilValue, position);
    }
    private static double calculatePosition(int size, int intervalCount, int intervalNumber){
        return (double) intervalNumber*(size+1)/intervalCount;
    }
    private static double solveValue(double floorPos, double ceilPos, double floorValue, double ceilValue, double position){
        if(floorPos==ceilPos || floorValue==ceilValue) return floorValue;

        return floorValue+((position-floorPos)*(ceilValue-floorValue));
    }
}
