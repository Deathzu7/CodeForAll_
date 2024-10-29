package io.codeforall.bootcamp;

public class Client implements Runnable{





    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("Client nº: " + i + " enter the server.");

        }
        System.out.println("Every client logged off");
    }
}
