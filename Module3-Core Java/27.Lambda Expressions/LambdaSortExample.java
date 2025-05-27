import java.util.*;
public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Eve", "Bob");

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}
