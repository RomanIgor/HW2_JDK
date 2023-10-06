public class Main {


    public static void main(String[] args) {

        Pair<Integer, Integer> intPair1 = new Pair<>(5, 6);
        Pair<Integer, Integer> intPair2 = new Pair<>(3, 4);

        Pair<Integer, Integer> intSumPair = PairCalc.addPairs(intPair1, intPair2);
        System.out.println("Sum of integer pairs: " + intSumPair);

        Pair<Double, Double> doublePair1 = new Pair<>(1.5, 2.5);
        Pair<Double, Double> doublePair2 = new Pair<>(2.0, 3.0);

        Pair<Double, Double> doubleSumPair = PairCalc.addPairs(doublePair1, doublePair2);
        System.out.println("Sum of double pairs: " + doubleSumPair);
    }
}