public class PatternMatchingSwitch {
    public static void main(String[] args) {
        printType(123);
        printType("Hello");
        printType(45.67);
        printType(true);
    }

    static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            case Boolean b -> System.out.println("Boolean: " + b);
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
