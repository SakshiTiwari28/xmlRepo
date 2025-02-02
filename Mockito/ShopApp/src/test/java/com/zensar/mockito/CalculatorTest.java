package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class CalculatorTest {

	@Mock
	private Calculator calculator =new Calculator();
	@Rule
	public MockitoRule rule =  MockitoJUnit.rule();
	@Test
	public void testAdd() {
		
		Mockito.when(calculator.add(5, 5)).thenReturn(11);
		
		assertEquals(11, calculator.add(5, 5));
		//Mockito.when(calculator.add(5, 5)).thenCallRealMethod();
	}
}
