import java.io.*;
import java.net.*;
import java.util.Scanner;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server is running on port: 5000");
        Socket socket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        // System.out.println("Client says: " + in.readLine());
        // out.println("Hii client, message recieved!");

        // two way communication
        String msg;
        while(true) {
            msg = in.readLine();
            System.out.println("Client says: " + msg);
            // break condition
            if(msg.equalsIgnoreCase("exit")) {
                out.println("Goodbye");
                break;
            }
            System.out.println("Your turn: ");
            out.println(sc.nextLine());
        }

        sc.close();
        socket.close();
        serverSocket.close();
    }
}

class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);

        // out.println("Hello server!");
        // System.out.println("Server says: " + in.readLine());

        String msg;
        while(true) {
            System.out.println("Your turn: ");
            out.println(sc.nextLine());

            msg = in.readLine();
            System.out.println("Server says: " + msg);
            if(msg.equals("Goodbye")) {
                break;
            }
        }

        sc.close();
        socket.close();
    }
}