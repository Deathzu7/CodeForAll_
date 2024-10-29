import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {


    private static final List<Client> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {


        int port = 8080;
        String hostName = "localhost";


        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server is listening on port " + port);


        while (true) {

            System.out.println("Waiting for a new client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");


            Client clientHandler = new Client(clientSocket, (ArrayList<Client>) clients);
            Thread thread = new Thread(clientHandler);
            thread.start();
        }
    }
}

