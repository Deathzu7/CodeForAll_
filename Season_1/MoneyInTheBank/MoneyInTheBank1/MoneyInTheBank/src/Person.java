public class Person {

    private String name; // VOU DAR NOME A PESSOA. SECALHAR VOU COMPLICAR E METER VARIAS PESSOAS A RANDOM.
    // CRIAR TRANSFERENCIAS ENTRE PLAYERS.
    private Bank bank;


    // METODO PARA IR AO BANCO
    public String goToBank(String name) {
        System.out.println("I go to bank " + name);
        return name;
    }
        // CONSTRUCTOR PERSON E BANK - PARA INVOCAR METODOS DO BANK
    public Person(Bank bank) {
        this.bank = bank;
    }

        // METODO PARA SABER BALANCE
    public void moneyBank() {
        System.out.println("I have: " + bank.getBalance() + "€");
    }

        // WITHDRAW AND DEPOSIT METHODS - INVOCAMOS DO BANK;
    public void withdraw (int amount){
        bank.withdraw(amount);
    }
    public void deposit(int amount){
        bank.deposit(amount);
    }

}