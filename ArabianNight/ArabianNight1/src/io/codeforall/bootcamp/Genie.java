package io.codeforall.bootcamp;

public class Genie {
    private int wishes;
    private int maxWishes;

    public Genie(int maxWishes){
        this.wishes = 0;
        this.maxWishes = maxWishes;
    }

    public void makeAWish() {
        System.out.println("Wish granted");
            wishes ++;  // Soma 1 wish.
        }

    public int getWishes() {
        return wishes;
    }
}


