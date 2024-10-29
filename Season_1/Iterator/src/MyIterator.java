import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator<Integer> {


    private int current;

    private int end;



    public MyIterator(int current, int end){
        this.current = current;
        this.end = end;
    }



    @Override
    public boolean hasNext() {

        return current <= end;
    }

    @Override
    public Integer next() {
        if (!hasNext()){
            throw new NoSuchElementException("No next elements");
        }
        return current++;
    }
}
