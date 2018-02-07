package com.lambda;

public class AddableImpl {

	public static void main(String[] args) {

		AddableImpl impl = new AddableImpl();
		
		System.out.println(impl.operate(1, 2, (a, b) -> a*b));
		System.out.println(impl.operate(1, 2, (a, b) -> a+b));
		
		System.out.println(impl.operate(1, 2, (a, b) -> {
			a=a+6;
			b=b*2;
			return a * b;
		}));
	}

	private int operate(int a, int b, IAddable i) {
		return i.add(a, b);
	}
}
