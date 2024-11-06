package io.codeforall.fanstatics;

import examples.string.StringInputScannerTest;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {


        Prompt var1 = new Prompt(System.in, System.out);
        HashSet<String> var2 = new HashSet<>();

        var2.add("yes");
        var2.add("no");
        StringSetInputScanner var3 = new StringSetInputScanner(var2);

        var3.setMessage("Are you gay? \n yes or no? ");
        var3.setError("Invalid answer! You have to be gay");

        boolean keepAsking = true;

        while (keepAsking) {
            String userInput = var1.getUserInput(var3);  // Captura a entrada do usuário

            switch (userInput) {
                case "yes":
                    System.out.println("Go Away Gay \n");
                     // Sai do loop
                    break;
                case "no":
                    System.out.println("Welcome Top G \n");
                      // Sai do loop
                    break;
                default:
                    System.out.println("Invalid input, please try again. \n");
                    // O `keepAsking` continua `true`, então o loop continua
                    break;
            }
        }
    }
}