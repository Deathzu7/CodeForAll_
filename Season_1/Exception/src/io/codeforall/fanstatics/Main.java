package io.codeforall.fanstatics;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        try {

            fileManager.createFile("ssss");
            fileManager.getFile("ss");
            System.out.println("----");


        } catch (NotEnoughSpaceException | NotEnoughPermissionsException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        }



    }
}
