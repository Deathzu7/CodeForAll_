import java.io.IOException;
import java.io.StringBufferInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {


        // STEP1: Get your host and port
        String hostName = "localhost";
        int foreignPort = 500000;
        int localPort = 8080;

        // STEP2: Create send and receive buffers
        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];

        // STEP3: Open a UDP (datagram) socket
        DatagramSocket socket = new DatagramSocket(localPort);

        // STEP4.1: Create and receive UDP datagram packet from the socket
        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket); // blocks while packet not received

       String receivedstring = new String(recvBuffer).trim();
       receivedstring=receivedstring.toUpperCase();
        System.out.println(receivedstring);

        sendBuffer=receivedstring.getBytes();
        







        // STEP4.2: Create and send UDP datagram packet from the socket

        DatagramPacket sendPacket = new DatagramPacket(sendBuffer,sendBuffer.length, receivePacket.getAddress(), receivePacket.getPort());
        socket.send(sendPacket);

// STEP5: Close the socket
    }
}
