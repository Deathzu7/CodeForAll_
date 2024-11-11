package io.codeforall.fanstatics.ClientHandler;

import io.codeforall.fanstatics.Comands.CommandAbstract;
import io.codeforall.fanstatics.Comands.Help;
import io.codeforall.fanstatics.Server.Server;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ClientHandler implements Runnable {

    private final Socket socket;
    private final Map<String, CommandAbstract> commandMap;

    private BufferedReader in;
    private BufferedWriter out;
    private String nick;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public BufferedWriter getOut() {
        return out;
    }

    public BufferedReader getIn() {
        return in;
    }

    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;

        commandMap = new HashMap<>();

    }

    public void setupCommandMap() throws IOException {
        commandMap.put("/help", new Help());
    }


    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            handler();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void handler() throws IOException {
        setupAccount();

        while (true) {
            String request = in.readLine();
            if (!request.startsWith("/")) {
                Server.broadcast(this, request);
            } else {
                commandMap.get(request).execute(this);
            }
        }
    }

    private void setupAccount() throws IOException {
        out.write("write your nick: \n");
        out.flush();

        Server.clientHandlers.add(this);

        Server.broadcast(this, nick + " has arrived !");
        out.write(("Welcome " + nick + " what would you like to do ? \n"));
        out.flush();
    }
}