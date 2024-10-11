package io.codeforall.bootcamp.exercise;

import java.util.Enumeration;

public class Ai {

    // STRINGS, CONSTRUCTOR, SETTER, GETTERS
    private String creationDate;
    private String name;

    public Ai(String creationDate, String name) {
        this.creationDate = creationDate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    // DOUBLE ARRAYS
    public int[] doubleArray;
    public int[] doubleArray(int[] nums) {
        int[] doubleArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            doubleArray[i] = nums[i] * 2;
        }
        return doubleArray;
    }

    // FACTORIAL ITERATIVE
   public int factorialIterative;
    public int factorialIterative(int n){

        int result = 1; // INICIACAO DE UM RESULTADO
        for (int i = 1; i <=n; i++){
            result = result * i;
            factorialIterative = result;
        }
        return factorialIterative;
    }

    // FACTORIAL RECURSIVE
    public int factorialRecursive;
    public int factorialRecursive(int n){
        if (n==0){
            return 1;
        }
        return n * factorialRecursive (n -1) ;
    }

    // PALINDROME REPLACE
    public String palindromeReplace;
    public String isPalindrome(String word){
        int left = 0;
        int right = 0;

    }


}