import java.util.List;
import java.util.Optional;

class Main {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        // use provider.getValues() to get List<Optional<Integer>>
        int result = 0;
        for (Optional<Integer> optInt : provider.getValues()) {
            if (optInt.isPresent()) {
                result += optInt.get();
            }
        }
        System.out.println(result);
    }
}