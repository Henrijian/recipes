import java.util.function.*;

class Predicate {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        public boolean test(int a, int b, int c);
    }

    public static void testMethod() {
        ToLongBiFunction<String, Double> test
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> (a != b && a != c && b != c);

}