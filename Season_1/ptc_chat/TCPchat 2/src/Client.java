import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        // STEP1: Get the host and the port from the command-line
        String hostName = "localhost";
        int portNumber = 8080;

// STEP2: Open a client socket, blocking while connecting to the server
        Socket clientSocket = new Socket(hostName, portNumber);

// STEP3: Setup input and output streams
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

// STEP4: Read from/write to the stream
// STEP5: Close the streams
// STEP6: Close the sockets

    }
}
