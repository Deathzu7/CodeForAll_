import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {


        int portNumber = 8080;
        //portNumber=8080;

// STEP2: Bind to local port and block while waiting for client connections
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(portNumber);
            System.out.println("server on");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

// this will block the thread , until a client connects to my server
        System.out.println("Now waiting...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("client on");

// STEP3: Setup input and output streams
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));



        String messageFromClient= in.readLine(); //"hello" fica a espera de input-bloquiant
        String upperCased = messageFromClient.toUpperCase();
        System.out.println(upperCased);
        out.println(upperCased);
// STEP4: Read from/write to the stream



// STEP5: Close the streams
// STEP6: Close the sockets


    }
}
