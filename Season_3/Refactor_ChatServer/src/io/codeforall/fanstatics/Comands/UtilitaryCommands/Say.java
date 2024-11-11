package io.codeforall.fanstatics.Comands.UtilitaryCommands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;

import java.io.IOException;

public class Say {
    public void execute(ClientHandler clientHandler, String message, ClientHandler sender) throws IOException {

        clientHandler.getOut().write((sender.getNick() + ": " + message
                +  "\n"));
        clientHandler.getOut().flush();
    }
}
