import javax.xml.catalog.CatalogFeatures;

public class Darkmode {

    public static void main(String[] args) {


        Toilet toilet = new Toilet();

        Bathroom bathroom = new Bathroom(toilet);

        Thread jorge = new Thread(new Cadet("Jorge", bathroom));
        Thread mafalda = new Thread(new Cadet("Mafalda", bathroom));
        Thread gustavo = new Thread(new Cadet("Gustavo", bathroom));

        jorge.start();
        mafalda.start();
        gustavo.start();






    }
}