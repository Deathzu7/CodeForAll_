public class Playground {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Person person1 = new Person(bank);


person1.goToBank("Santander");
person1.moneyBank();
person1.deposit(100);
person1.withdraw(-400);
person1.moneyBank();


    }
}
