public class NumTools {

    public static double average(IntSequence sequence, int n) {

        int count = 0;
        double sum = 0;

        while (sequence.hasNext() && count < n) {
            sum += sequence.next();
            count++;
        }
        return sum / n;
    }
}
