package com.java.eight.interfc.diamond2;

public interface IGamma extends IAlpha{

	@Override
	default void doIt() {
		System.out.println("printMe in IGamma");
	}

}
