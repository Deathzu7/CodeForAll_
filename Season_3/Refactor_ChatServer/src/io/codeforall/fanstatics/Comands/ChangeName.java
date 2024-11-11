package io.codeforall.fanstatics.Comands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;
import io.codeforall.fanstatics.Server.Server;

import java.io.IOException;

public class ChangeName extends CommandAbstract {

    @Override
    public void execute(ClientHandler clientHandler) throws IOException {
        clientHandler.getOut().write(("Write new name: \n"));
        clientHandler.getOut().flush();

        String oldNick = clientHandler.getNick();

        clientHandler.getOut().write(("Name changed to " + clientHandler.getNick() + "! \n"));
        clientHandler.getOut().flush();
        Server.broadcast(clientHandler,  oldNick + " has changed it's nick to " + clientHandler.getNick());
    }


    }
