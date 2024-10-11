public class Playground {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Person person1 = new Person(bank, 5000);
       // Person person2 = new Person(bank);



        person1.goToBank("Santander");
        person1.balanceBank();
        person1.withdraw(100);
        person1.deposit(100);
        person1.balanceBank();
    }
}
