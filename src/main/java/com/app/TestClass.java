package com.app;

import com.app.helper.id.Sequence;
import com.app.helper.id.UniqueIDGenerator;

public class TestClass {
	public static void main(String[] args) {
		UniqueIDGenerator generator = new UniqueIDGenerator(12, Sequence.ALL);
		System.out.println(generator.generateID());
	}
}
