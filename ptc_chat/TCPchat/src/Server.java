import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {


// Define a porta em que o servidor irá escutar conexões.
        int port = 8080;

// Cria um ServerSocket que escuta na porta especificada.
        ServerSocket serverSocket = new ServerSocket(port);

// Aceita uma conexão de um cliente. O método 'accept()' bloqueia até que um cliente se conecte.
        Socket clientSocket = serverSocket.accept();

// Mensagem indicando que a conexão foi estabelecida.
        System.out.println("Connection established");

// Cria um PrintWriter para enviar dados ao cliente. O parâmetro 'true' permite auto-flush.
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

// Cria um BufferedReader para ler dados enviados pelo cliente.
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

// Inicia um loop infinito para esperar e processar mensagens do cliente.
        while (true) {
            // Mensagem informando que o servidor está aguardando uma nova mensagem do cliente.
            System.out.println("Waiting for new message");

            // Lê uma linha de entrada do cliente.
            String input = in.readLine();

            // Verifica se a entrada é nula (o cliente desconectou) ou se o cliente enviou "bye".
            if (input == null || input.equalsIgnoreCase("bye")) {
                // Mensagem informando que o cliente se desconectou.
                System.out.println("Client disconnected");
                break; // Sai do loop se o cliente se desconectar.
            }

            // Exibe a mensagem recebida do cliente.
            System.out.println(input);
        }

// Fecha o BufferedReader de entrada do cliente.
        in.close();

// Fecha o PrintWriter de saída para o cliente.
        out.close();

// Fecha o socket do cliente.
        clientSocket.close();

// Fecha o ServerSocket para liberar a porta.
        serverSocket.close();

    }
}
