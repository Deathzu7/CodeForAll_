public class Bank {

    private int balance;
    private int withDraw;
    private int deposit;

    public Bank() {
        this.balance = 1000;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount < balance && amount >= 0) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount + " €");
        } else {
            System.out.println("Can't withdraw");
        }
    }

    public void deposit(int amount) {
        if (amount >= 0) {
            balance = balance + amount;
            System.out.println("Nice, you have deposit: " + amount + "€" + " in Santander");
        }
        if (amount < 0) {
            System.out.println("Can't deposit");
            ;
        }
    }

    public void tranfersMoneyAccounts(){

    }


}


