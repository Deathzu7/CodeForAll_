import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable {

    private final Socket clientSocket;
    private String userName;
    private final ArrayList<Client> clients;
    private PrintWriter out;


    public Client(Socket clientSocket, ArrayList<Client> clients) {

        this.clientSocket = clientSocket;
        this.clients = clients;
    }


    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("Enter your username:");
            this.userName = in.readLine();
            System.out.println("User connected: " + userName);

            synchronized (clients) {
                clients.add(this);
            }

            String input;

            while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected " + userName);
                    break;
                }
                System.out.println(userName + ": " + input);

                // Verifica se o comando é /broadcast
                if (input.startsWith("/broadcast ")) {
                    String message = input.substring(11); // Remove o comando "/broadcast"
                    broadcastMessage(userName + " (broadcast): " + message);

                }
            }

            in.close();
            out.close();
            clientSocket.close();

            synchronized (clients) {
                clients.remove(this);
            }


        } catch (IOException e) {
            System.out.println("Error handling client: " + e.getMessage());
            e.printStackTrace();

        }
    }

    // Método para enviar uma mensagem a todos os clientes conectados
    private void broadcastMessage(String message) {
        synchronized (clients) {
            for (Client client : clients) {
                client.sendMessage(message);
            }
        }
    }

    //Envia uma mensagem para este cliente em especifico.
    public void sendMessage(String message) {
        out.println(message);
    }


}