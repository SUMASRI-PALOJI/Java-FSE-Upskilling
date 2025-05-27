import java.util.concurrent.*;
import java.util.*;

public class ExecutorCallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int id = i;
            tasks.add(() -> "Result from task " + id);
        }

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
