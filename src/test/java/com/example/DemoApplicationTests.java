package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.documents.ExternalDocument;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	public TestRestTemplate trt;
	
	@Test
	public void test() {
		assertEquals("Hola", trt.getForObject("/one/ar", String.class));
	}
	
	@Test
	public void test1(){
		
		ExternalDocument ed = trt.getForObject("/one/0a9d19a1-f3e4-4204-8490-3ae311ab7493", ExternalDocument.class);				
		
		assertEquals("pepe", ed.getLastName());
	}

}
