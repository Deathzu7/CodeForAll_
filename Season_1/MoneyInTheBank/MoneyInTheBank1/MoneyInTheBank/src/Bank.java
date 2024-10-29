public class Bank {


   private int balance; // = 1000;

        // CONSTRUCTOR
    public Bank(){
        this.balance = 2000;
    }
        // GET
    public int getBalance() {
        return balance;
    }

    //Metodos de withdraw e deposit
    public void withdraw (int amount){
        if (amount >= 0 && balance >= amount){
            balance = balance - amount;
            System.out.println("You withdrew from Santander: " + amount + "€");
        }
        if (amount < 0){
            System.out.println("Can't withdraw!");
        }
        //if (amount < balance){
      //      System.out.println("Error, don't have enough balance");
      //  }
    }
public void deposit (int amount){
        if (amount >= 0){
            balance = balance + amount;
            System.out.println("Nice, you have deposit: " + amount +"€" + " in Santander");
        }
        if (amount < 0 ){
            System.out.println("Can't deposit");;
        }
}


}



