package io.codeforall.bootcamp.exercise;

public class Ai {
    private String creationDate;
    private String name;
    private int[] doubledArray;
    private int factorialIterative;
    private int factorialRecursive;

    // Constructor
    public Ai(String creationDate, String name) {
        this.creationDate = creationDate;
        this.name = name;
    }

    // Getters
    public String getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }

    public int[] getDoubledArray() {
        return doubledArray;
    }

    // Setters
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to double the array -
    public int[] doubleArray(int[] nums) {
        int[] doubledArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            doubledArray[i] = nums[i] * 2;
        }
        return doubledArray;
    }

    // FACTORIAL ITERATIVE
    public int factorialIterative(int n) {

        int result = 1;  // Initialize result - we need to add a value here.
        for (int i = 1; i <= n; i++) {
            result = result * i;
            factorialIterative = result;
        }
        return factorialIterative;
    }
    // FACTORIAL RECURSIVE

    int recursive;

    public int factorialRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }

    // PALINDROME

    private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to replace palindrome words with "palindrome"
    public String palindromeReplace(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // StringBuilder to build the resulting string
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Check if the word is a palindrome
            if (isPalindrome(word.replaceAll("[^a-zA-Z]", ""))) {  // Remove non-alphabetic characters
                result.append("palindrome ");
            } else {
                result.append(word + " ");
            }
        }

        // Convert StringBuilder to String and trim any extra spaces
        return result.toString().trim();
    }
public static String emailValidator(){
        return "(^([a-zA-Z0-9._%+#-])+@[a-zA-Z0-9.-]+[a-zA-Z]{2,}$)";

}

}