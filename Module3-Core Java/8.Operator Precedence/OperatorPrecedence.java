public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result: " + result1);
        System.out.println("Explanation: Multiplication (*) is done before addition (+). So, 5 * 2 = 10, then 10 + 10 = 20.");
        System.out.println();
        int result2 = (10 + 5) * 2;
        System.out.println("Expression: (10 + 5) * 2");
        System.out.println("Result: " + result2);
        System.out.println("Explanation: Parentheses are evaluated first. 10 + 5 = 15, then 15 * 2 = 30.");
        System.out.println();
        int result3 = 100 / 10 + 4 * 3 - 2;
        System.out.println("Expression: 100 / 10 + 4 * 3 - 2");
        System.out.println("Result: " + result3);
        System.out.println("Explanation:");
        System.out.println("Step 1: 100 / 10 = 10");
        System.out.println("Step 2: 4 * 3 = 12");
        System.out.println("Step 3: 10 + 12 = 22");
        System.out.println("Step 4: 22 - 2 = 20");
        System.out.println();
        int result4 = 8 + 2 * (15 - 5) / 5;
        System.out.println("Expression: 8 + 2 * (15 - 5) / 5");
        System.out.println("Result: " + result4);
        System.out.println("Explanation:");
        System.out.println("Step 1: (15 - 5) = 10");
        System.out.println("Step 2: 2 * 10 = 20");
        System.out.println("Step 3: 20 / 5 = 4");
        System.out.println("Step 4: 8 + 4 = 12");
    }
}
