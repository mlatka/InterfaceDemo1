public class Main {

    public static void main(String[] args) {

        DigitSequence ds = new DigitSequence(123);

        IntSequence sequence= new DigitSequence(1000);

        System.out.println("Average= " + NumTools.average(ds,2));
        System.out.println(NumTools.average(sequence,4));

        if (sequence instanceof DigitSequence) {
            System.out.println("What was left ... " + ((DigitSequence) sequence).rest());
        }


//        while (ds.hasNext()) {
//            int k = ds.next();
//            System.out.println("Test " + k);
//        }
    }
}
