package io.codeforall.fanstatics;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.converters.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)

public class MoneyTest {

    @Test
    @Parameters({"10, EUR", "20, USD", "50, YEN"})

    public void constructorShouldSetAmountAndCurrencyTest(int amount, String currency) {

        //Setup & Exercise
        Money money = new Money(amount, currency);
        //Criar uma instacia de algo que eu quero criar.

        // Verify
        Assert.assertEquals(10, money.getAmount());
        Assert.assertEquals("EUR", money.getCurrency());
    }
    @Test
    @Parameters({"-5", "0", "-75"})
    public void constructorInvalidAmountLogicTest(int invalidAmount) {
        new Money(invalidAmount, "EUR");
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"", " ", "null"})
    public void constructorShouldThrowExceptionInvalidCurrency(@Nullable String invalidCurrency){
        new Money(10, invalidCurrency);

    }
}
