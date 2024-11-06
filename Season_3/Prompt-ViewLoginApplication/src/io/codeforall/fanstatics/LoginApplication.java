package io.codeforall.fanstatics;

import java.util.Scanner;

public class LoginApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] options = {"Men", "Women"};
        boolean validInput = false;
        int answerIndex = -1;

        // Pergunta ao usuário até que uma entrada válida seja recebida
        while (!validInput) {
            System.out.println("What gender are you?");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Choose an option (1 or 2): ");

            if (scanner.hasNextInt()) {
                answerIndex = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                if (answerIndex >= 1 && answerIndex <= options.length) {
                    validInput = true;
                } else {
                    System.out.println("Sorry, only 2 genders available! Please choose a valid option.");
                }
            } else {
                System.out.println("Sorry, only 2 genders available! Please choose a valid option.");
                scanner.nextLine(); // Limpar a entrada inválida
            }
        }

        System.out.println("User is: " + options[answerIndex - 1] + ", welcome to the login system!");

        // Prompt para o nome de usuário
        System.out.print("Username: ");
        String usernameInput = scanner.nextLine();

        // Prompt para a senha
        System.out.print("Password: ");
        String passwordInput = scanner.nextLine();

        System.out.println("Login! Welcome, " + usernameInput + "!");

        scanner.close();
    }
}
