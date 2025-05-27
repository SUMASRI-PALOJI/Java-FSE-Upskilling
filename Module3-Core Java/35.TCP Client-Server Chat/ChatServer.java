import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started...");

        Socket client = server.accept();
        System.out.println("Client connected.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Client: " + line);
            System.out.print("You: ");
            writer.println(console.readLine());
        }

        server.close();
    }
}
