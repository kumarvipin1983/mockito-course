package com.test.mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MoneyParameterizedTest {
	
	@Test
	@Parameters(name = "getMoney")
	public void testConstructorShouldSetAmountAndCurrency(int amount, String currency) {
		Money money1 = new Money(amount, currency);
		
		assertEquals(amount, money1.getAmount());
		assertEquals(currency, money1.getCurrency());
	}
}
