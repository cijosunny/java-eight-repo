package com.java.eight.interfc.diamond2;

public interface IBeta extends IAlpha{

	@Override
	default void doIt() {
		System.out.println("printMe in IBeta");
	}

}
