package io.bootcamp.fanstatics;

public class Main {


    public static final String STRING = "rui rui rui campelo campelo campelo test abc abc";

    public static void main(String[] args) {
        uniqueWord wc = new uniqueWord(STRING);

        for (String word : wc) {
            System.out.println(word);
        }

    }

}
