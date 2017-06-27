package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooImpl implements Foo {

	@Autowired
	Bar bar;
	
	@Override
	public String sayHello() {
		return "Hello " + bar.getName();
	}

}
