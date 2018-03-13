package com.java.eight.interfc.diamond2;

public interface IAlpha {
	default void doIt(){
		System.out.println("printMe in IAlpha");
	}
}
