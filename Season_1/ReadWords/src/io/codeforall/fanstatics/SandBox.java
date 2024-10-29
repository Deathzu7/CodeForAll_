package io.codeforall.fanstatics;

import java.io.*;
import java.util.Iterator;

public class SandBox {

    private static final String SOURCE_FILE = "/Users/codecadet/Documents/HandType.java";

    public static void main(String[] args) throws IOException {

        // create a new file reader
        WordReader wordReader = new WordReader(SOURCE_FILE);

        for (String words : wordReader) {
            System.out.println(words);
        }

        Iterator<String> iterator = wordReader.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
