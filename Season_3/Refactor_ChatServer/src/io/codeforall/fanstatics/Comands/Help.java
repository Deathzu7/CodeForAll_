package io.codeforall.fanstatics.Comands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;

import java.io.IOException;

public class Help extends CommandAbstract {

    @Override
    public void execute(ClientHandler clientHandler) throws IOException {
        clientHandler.getOut().write(("Available commands: /help, /whisper, /quit, /list, /changeName \n"));
        clientHandler.getOut().flush();
    }
}
