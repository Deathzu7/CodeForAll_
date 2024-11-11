package io.codeforall.fanstatics.Comands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;

import java.io.IOException;

public class Disconnect extends CommandAbstract {

    @Override
    public void execute(ClientHandler clientHandler) throws IOException {
        clientHandler.getOut().write(("See you soon ! \n"));
        clientHandler.getOut().flush();
    }
}
