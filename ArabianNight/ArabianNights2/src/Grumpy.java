public class Grumpy extends Genie{

    public Grumpy(){
        super(5);
    }

    @Override
    public void makeAWish(){
        if (getWishes() < 1){
            super.makeAWish();
        }else {
            System.out.println("Grumpy can´t give you more wishes");
        }
    }
}
