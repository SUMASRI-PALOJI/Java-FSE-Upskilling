import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            if (id == -1) break;

            scanner.nextLine(); // consume newline
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to look up: ");
        int lookupId = scanner.nextInt();
        String result = studentMap.get(lookupId);
        if (result != null) {
            System.out.println("Student Name: " + result);
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}
