package io.codeforall.fanstatics.Comands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;
import io.codeforall.fanstatics.Server.Server;

import java.io.IOException;

public class ListUsers extends CommandAbstract{

    @Override
    public void execute(ClientHandler clientHandler) throws IOException {
        clientHandler.getOut().write(( "There are currently " + Server.clientHandlers.size() + " users online: \n"));
        for (ClientHandler client : Server.clientHandlers) {
            clientHandler.getOut().write((client.getNick() + "\n"));
        }
        clientHandler.getOut().flush();
    }
}
