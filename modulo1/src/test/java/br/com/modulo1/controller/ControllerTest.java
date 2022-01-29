package br.com.modulo1.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import br.com.modulo1.models.Product;

public class ControllerTest {
	
	@InjectMocks
	private Controller controller;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCreateProductOk() {
		Product product = new Product();
		product.setId(1l);
		product.setProductName("Celular");
		assertTrue(controller.createProduct(product).getStatusCode().is2xxSuccessful());
	}
	
	@Test
	public void testCreateProductNoOk() {
		Product product = new Product();
		product.setId(1l);
		assertTrue(controller.createProduct(product).getStatusCode().is4xxClientError());
	}

}
