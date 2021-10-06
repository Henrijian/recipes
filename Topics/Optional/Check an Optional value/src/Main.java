import java.util.Optional;

class Main {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        // use provider.getValue() to get Optional<String>
        Optional<String> optStr = provider.getValue();
        if (optStr.isPresent()) {
            System.out.println(optStr.get());
        }
    }
}