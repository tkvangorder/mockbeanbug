package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BarImpl implements Bar {

	@Override
	public String getName() {
		return "Fred";
	}

}
