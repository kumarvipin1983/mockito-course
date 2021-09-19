package com.test.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testConstructorShouldSetAmountAndCurrency() {
		Money money1 = new Money(10, "USD");
		assertEquals(10, money1.getAmount());
		assertEquals("USD", money1.getCurrency());
		
		Money money2 = new Money(20, "EUR");
		assertEquals(20, money2.getAmount());
		assertEquals("EUR", money2.getCurrency());
	}
}
