public class HelloWorld {
    public void sayHello() {
        System.out.println("Hello, bytecode!");
    }

    public static void main(String[] args) {
        new HelloWorld().sayHello();
    }
}
