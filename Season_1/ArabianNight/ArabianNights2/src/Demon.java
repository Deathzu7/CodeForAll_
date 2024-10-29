public class Demon extends Genie {

    public Demon() {
        super(50);
    }

    @Override
    public void makeAWish(){
        super.makeAWish();
        System.out.print("Demon: Wish granted, but there will be consequence!");
    }
}
