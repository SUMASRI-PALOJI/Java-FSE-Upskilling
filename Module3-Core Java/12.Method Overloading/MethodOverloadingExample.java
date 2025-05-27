public class MethodOverloadingExample {
    // Method 1: Two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 3: Three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(5, 10));
        System.out.println("add(double, double): " + add(5.5, 4.5));
        System.out.println("add(int, int, int): " + add(1, 2, 3));
    }
}
