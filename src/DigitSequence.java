public class DigitSequence implements IntSequence {
    private int n;

    public DigitSequence(int n) {
        this.n = n;
    }

    public boolean hasNext() {
        if (n > 0)
            return true;
        else
            return false;
    }

    public int next() {
        int reminder = n % 10;
        n /= 10;
        return reminder;
    }

    public int rest(){
        return n;
    }
}
