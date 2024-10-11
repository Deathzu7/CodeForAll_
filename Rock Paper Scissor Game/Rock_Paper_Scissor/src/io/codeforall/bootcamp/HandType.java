package io.codeforall.bootcamp;

public enum HandType {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSOR("Scissor");

    private String handSelected;
    HandType(String handSelected){
        this.handSelected = handSelected;
    }

    public String getHandSelected() {
        return this.handSelected;
    }
}
