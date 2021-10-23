package com.mockito.car;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockitoReturningDesiredValuesTest {

	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testStubbing() throws Exception {
		assertFalse("New test double should return false as boolean ", myFerrari.needFuel());
		when(myFerrari.needFuel()).thenReturn(true);
		
		assertTrue("After instructed test double should return what we want ", myFerrari.needFuel());
	}

	@Test(expected = RuntimeException.class)
	public void throwException() {
		when(myFerrari.needFuel()).thenThrow(new RuntimeException());
		myFerrari.needFuel(); 
	}
	
	@Test
	public void testVerifcation() {
		myFerrari.driveTo("Sweet home India");
		myFerrari.needFuel(); 
		
		verify(myFerrari).driveTo("Sweet home India");
		verify(myFerrari).needFuel();
	}
}
