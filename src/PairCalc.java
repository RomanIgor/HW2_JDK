public class PairCalc {
    public static <T extends Number> Pair<T, T> addPairs(Pair<T, T> pair1, Pair<T, T> pair2) {
        T firstSum = (T) (Number) (pair1.getFirst().doubleValue() + pair2.getFirst().doubleValue());
        T secondSum = (T) (Number) (pair1.getSecond().doubleValue() + pair2.getSecond().doubleValue());
        return new Pair<>(firstSum, secondSum);
    }
}