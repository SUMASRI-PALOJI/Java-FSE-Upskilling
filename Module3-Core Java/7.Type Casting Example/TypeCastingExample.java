public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.75;
        int myInt = (int) myDouble;
        System.out.println("Original double value: " + myDouble);
        System.out.println("Double cast to int: " + myInt);
        int num = 42;
        double convertedDouble = (double) num;
        System.out.println("Original int value: " + num);
        System.out.println("Int cast to double: " + convertedDouble);
    }
}
