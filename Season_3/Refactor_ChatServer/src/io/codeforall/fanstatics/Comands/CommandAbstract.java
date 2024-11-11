package io.codeforall.fanstatics.Comands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;

import java.io.IOException;

public abstract class CommandAbstract {

    public void execute(ClientHandler clientHandler) throws IOException {
        clientHandler.getOut().write("Unknow command \n");
        clientHandler.getOut().flush();

    }

}
