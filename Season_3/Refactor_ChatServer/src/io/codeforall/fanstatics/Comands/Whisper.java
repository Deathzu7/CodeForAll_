package io.codeforall.fanstatics.Comands;

import io.codeforall.fanstatics.ClientHandler.ClientHandler;
import io.codeforall.fanstatics.Server.Server;

import java.io.IOException;

public class Whisper extends CommandAbstract {
    @Override
    public void execute(ClientHandler clientHandler) throws IOException {
        clientHandler.getOut().write(("To whom belongs this secret : \n"));
        clientHandler.getOut().flush();

    String nick = clientHandler.getIn().readLine();
        for (ClientHandler client : Server.clientHandlers) {
        if (client.getNick().equals(nick)) {

            clientHandler.getOut().write(( "What secret you wanna tell : \n"));
            clientHandler.getOut().flush();

            client.getOut().write(( clientHandler.getNick() +
                    " whisper:" + clientHandler.getIn().readLine() +  "\n"));
            clientHandler.getOut().flush();
            client.getOut().flush();

            return;
        }
    }

        clientHandler.getOut().write(( nick + " is not online \n"));
        clientHandler.getOut().flush();
}
}