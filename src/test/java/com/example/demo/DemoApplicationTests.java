package com.example.demo;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This test is broken because it extends AbstractTransactionalJUnit4SpringContextTests
 * @author tyler.vangorder
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE, classes= {MyConfiguration.class})
public class DemoApplicationTests extends AbstractTransactionalJUnit4SpringContextTests{

	@MockBean
	Bar bar;
	
	@Autowired
	Foo foo;
	
	@Test
	public void testHello() {
		//The following line will result in a null pointer exception because the "bar" mock bean is not being autowired
		//into the test class when we extend AbstractTransactionalJUnit4SpringContextTests
		when(bar.getName()).thenReturn("Joe");
		
		System.out.println(foo.sayHello());
	}

}
