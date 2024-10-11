package io.codeforall.bootcamp;

public class Grumpy extends Genie{


    public Grumpy(){
        super(5);   // Grumpy Genie só pode conceder até 1 desejo
    }

    @Override
    public void makeAWish() {           // BUSCAR O METODO IGUAL E ADICIONAR UMA CONDICIONANTE.
        if (getWishes() < 1) {
            super.makeAWish();
        } else {
            System.out.println("No wishes for you");
        }
    }
}

