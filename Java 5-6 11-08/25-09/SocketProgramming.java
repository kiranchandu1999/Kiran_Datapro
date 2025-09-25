import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4000);
        System.out.println("Server running on port: 4000");
        Socket socket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        System.out.println("Client says: " + in.readLine());

        out.println("Hello, client!!");

        socket.close();
        serverSocket.close();
    }
}

class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("Hi, server!!");

        System.out.println("Server says: " + in.readLine());

        socket.close();
    }
}