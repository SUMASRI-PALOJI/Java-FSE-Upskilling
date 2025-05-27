import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            System.out.print("You: ");
            writer.println(console.readLine());
            line = reader.readLine();
            System.out.println("Server: " + line);
        }
    }
}
