package io.codeforall.fanstatics;

public class Money {

    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {

        if(amount <= 0){
            throw new IllegalArgumentException("Amount should be higher than zero");
        }

        if (currency == null || currency.isEmpty()){
            throw new IllegalArgumentException("Currency not found");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}

