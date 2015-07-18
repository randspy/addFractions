package addFraction;

public class GreatestCommonDivisor {

    public int calculate(int first, int second) {
        while (second != 0) {
            int temp = first % second;
            first = second;
            second = temp;
        }
        return first;
    }
}
