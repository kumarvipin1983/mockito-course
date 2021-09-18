package com.mockito.car;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class FirstMockitoTest {

	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testIfCarisACarType() {
		assertTrue(myFerrari instanceof Car);
	}

}
