public class Friendly extends Genie{

    public Friendly(){
        super(3);
    }

   @Override
   public void makeAWish(){
        if (getWishes() < 3){
            super.makeAWish();
        } else{
            System.out.println("Friendly Genie can't give you a wish");
        }
   }

}
