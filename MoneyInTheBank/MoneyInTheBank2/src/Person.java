public class Person {

    private Bank bank;
    private int wallet;

    public Person(Bank bank, int wallet) {
        this.bank = bank;
        this.wallet = wallet;
    }


    public void goToBank(String name) {
        System.out.println("I go to bank: " + name);
    }

    public void balanceBank() {
        System.out.println("I have: " + bank.getBalance() + "€");
    }

    public void withdraw(int amount) {

        bank.withdraw(amount);
        wallet = wallet + amount;
        System.out.println("Wallet left with: " + getBalanceWallet());
    }

    public void deposit(int amount) {
        if (amount < wallet) {
            bank.deposit(amount);
            wallet = wallet - amount;
            System.out.println("Wallet has: " + getBalanceWallet());
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }
        public int getBalanceWallet() {
            return wallet;
        }

        public void transferMoney(int amount){
            if(amount > wallet){

            }
        }
    }

