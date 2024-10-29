package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class WordReader implements Iterable<String> {

    FileReader fileReader;
    BufferedReader bReader;
    String[] words;

    public WordReader(String file) throws IOException {

        // create a new file reader
        this.fileReader = new FileReader(file);
        // wrap the file reader using a buffered reader
        this.bReader = new BufferedReader(this.fileReader);

        String line = " ";
        String result = " ";

            // using the buffered reader we can read lines
            while ((line = bReader.readLine()) != null) {
                line = line.replaceAll(",", "");
                result += line + "\n";
            }
            this.words = result.split(" ");


        }


        @Override
        public Iterator<String> iterator () {
            return Arrays.stream(this.words).iterator();


        }
    }