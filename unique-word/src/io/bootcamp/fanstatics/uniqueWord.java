package io.bootcamp.fanstatics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class uniqueWord implements Iterable<String> {

    private HashSet<String> names;

    public uniqueWord(String allNames) {
        this.names = new HashSet(List.of(allNames.split(" ")));
    }

    @Override
    public Iterator<String> iterator() {
        return names.iterator();
    }
}
