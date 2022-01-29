package br.com.modulo2.controllers;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ControllerTest {
	
	@InjectMocks
	private Controller controller;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		assertEquals(BigDecimal.valueOf(1.0), controller.soma(BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.9)).getBody());
	}

}
