
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class server {

    public static void main(String[] args) throws IOException {
        int port = 8080;

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server is listening on port " + port);

        Socket clientSocket = serverSocket.accept();
        System.out.println("Connection established");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine;
        boolean imageRequest = false;
        boolean notFoundRequest = false;

        //le a requisao do cliente
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            if (inputLine.isEmpty()) {
                break; // Fim dos cabeçalhos
            }
            // verificar o tipo de requisao
            if (inputLine.contains("GET /image")) {
                imageRequest = true;
            } else if (inputLine.contains("GET /notfound")) {
                notFoundRequest = true;
            }
        }


        if (notFoundRequest) {
            String http404 = "HTTP/1.0 404 Not Found\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: 1000\r\n" +
                    "\r\n" +
                    "<html><body><h1>404 Not Found</h1></body></html>";
            out.println(http404);

        } else if (imageRequest) {
// Caminho para a imagem no diretório
            File imageFile = new File("www/logo.png"); // Substitua com o caminho correto
            if (imageFile.exists()) {
                // Obtém o tamanho da imagem
                long fileLength = imageFile.length();

                // Cabeçalho HTTP para a imagem
                String httpImageHeader = "HTTP/1.0 200 OK\r\n" +
                        "Content-Type: image/png\r\n" +
                        "Content-Length: " + fileLength + "\r\n" +
                        "\r\n";

                // Envia o cabeçalho
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(httpImageHeader.getBytes());

                // Envia a imagem em bytes
                FileInputStream fileInputStream = new FileInputStream(imageFile);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                fileInputStream.close();
                outputStream.flush();
            }


            } else {
            String htmlResponse = "HTTP/1.0 200 OK\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: 1000\r\n" +
                    "\r\n" +
                    "<html><body><h1>index.html</h1></body></html>"; // Corpo da resposta
            out.println(htmlResponse);
            }


            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

        }
    }


