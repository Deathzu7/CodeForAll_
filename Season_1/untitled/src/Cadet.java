import java.sql.BatchUpdateException;
import java.util.Base64;

public class Cadet implements Runnable {

    private String name;
    private Bathroom bathroom;

    public Cadet(String name, Bathroom bathroom) {
        this.name = name;
        this.bathroom = bathroom;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        
        bathroom.enter();
        bathroom.wasHands();
    }

}
