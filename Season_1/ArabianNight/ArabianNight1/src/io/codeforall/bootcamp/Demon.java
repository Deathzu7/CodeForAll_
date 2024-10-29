package io.codeforall.bootcamp;

public class Demon extends Genie{

    public Demon(){
        super(20);   // O Demon pode conceder muitos desejos, mas tem uma consequência
    }

    @Override
    public void makeAWish() {

        super.makeAWish();
        System.out.println("Demon: Wish granted, but there will be a consequence!");
            }
    }

