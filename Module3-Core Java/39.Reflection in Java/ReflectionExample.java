import java.lang.reflect.*;

class Person {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public void sayAge(int age) {
        System.out.println("I am " + age + " years old.");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Load the class dynamically using its name
        Class<?> clazz = Class.forName("Person");

        // Create an instance of the loaded class
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Get all declared methods
        Method[] methods = clazz.getDeclaredMethods();

        // Print method names and parameters
        for (Method method : methods) {
            System.out.print("Method: " + method.getName() + "(");
            Class<?>[] paramTypes = method.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                System.out.print(paramTypes[i].getSimpleName());
                if (i < paramTypes.length - 1) System.out.print(", ");
            }
            System.out.println(")");

            // Invoke methods with example arguments
            if (method.getName().equals("greet")) {
                method.invoke(obj, "Reflection");
            } else if (method.getName().equals("sayAge")) {
                method.invoke(obj, 25);
            }
        }
    }
}
