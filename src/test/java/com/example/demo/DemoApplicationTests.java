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

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE, classes= {MyConfiguration.class})
public class DemoApplicationTests extends AbstractTransactionalJUnit4SpringContextTests{

	@MockBean
	Bar bar;
	
	@Autowired
	Foo foo;
	
	@Test
	public void testHello() {
		when(bar.getName()).thenReturn("Joe");
		
		System.out.println(foo.sayHello());
	}

}
