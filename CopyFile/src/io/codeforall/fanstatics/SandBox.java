package io.codeforall.fanstatics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SandBox {
    public static void main(String[] args) throws IOException {
        String sourceFile = new String("/Users/codecadet/Documents/HandType.java");
        String targetFile = new String("/Users/codecadet/Documents/HandType_Copy.java");
        int bufferSize = 1024;

        // open an input stream with a file path as the source
        FileInputStream inputStream = new FileInputStream(sourceFile);

        // open an output stream with a file path as the destination
        FileOutputStream outputStream = new FileOutputStream(targetFile);

        // read multiple bytes from the source file
        byte[] buffer = new byte[bufferSize];
        int num=0;

        while (num != -1) {
            num = inputStream.read(buffer);
            System.out.println(num);
            if (num == -1) {
                break;
            }

                outputStream.write(buffer, 0, num);
                System.out.println("I have write this many bytes: " + num);

        }

        // don't forget to close the input stream
        inputStream.close();
        outputStream.close();


    }
}
