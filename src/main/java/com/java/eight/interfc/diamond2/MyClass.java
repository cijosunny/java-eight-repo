package com.java.eight.interfc.diamond2;

public class MyClass implements IBeta,IGamma{

	@Override
	public void doIt() {
		IGamma.super.doIt();
	}

}
