import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        // Define o hostname e a porta do servidor com o qual o cliente vai se conectar.
        String hostname = "localhost"; // O endereço do servidor (localhost indica que está na mesma máquina).
        int port = 8080; // A porta em que o servidor está ouvindo conexões.

        // Cria um socket de cliente que se conecta ao servidor especificado pelo hostname e porta.
        Socket clientSocket = new Socket(hostname, port);

        // Cria um PrintWriter para enviar dados ao servidor.
        // O parâmetro 'true' permite a auto-flush, garantindo que os dados sejam enviados imediatamente.
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        // Cria um BufferedReader para ler dados enviados pelo servidor.
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Cria um BufferedReader para ler a entrada do usuário a partir do console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Inicia um loop infinito para permitir que o usuário digite mensagens.
        while (true) {
            // Lê uma linha de entrada do usuário do console.
            String userInput = reader.readLine();

            // Envia a mensagem do usuário para o servidor.
            out.println(userInput);

            // Se o usuário digitar "bye", o cliente se desconecta do servidor.
            if(userInput.equalsIgnoreCase("bye")){
                System.out.println("Disconnected from server"); // Mensagem de desconexão.
                break; // Sai do loop.
            }
        }

        // Fecha o BufferedReader de entrada do servidor.
        in.close();

        // Fecha o PrintWriter de saída para o servidor.
        out.close();

        // Fecha o socket do cliente.
        clientSocket.close();
    }
    }
